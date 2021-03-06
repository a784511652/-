package com.imooc.controller;

import com.imooc.VO.ResultVO;
import com.imooc.converter.OrderForm2OrderDTOConverter;
import com.imooc.dto.OrderDTO;
import com.imooc.enums.ResultEnum;
import com.imooc.exception.SellException;
import com.imooc.form.OrderForm;
import com.imooc.service.BuyerService;
import com.imooc.service.OrderService;
import com.imooc.utils.ResultVOUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * @auther jiahaowei
 * @date： 2017/10/24 0024
 * @time： 23:37
 * @project_name： mc_springboot_dinner
 * @Description ：
 *
 *
 *
 */
@RestController
@RequestMapping("/buyer/order")
@Slf4j
public class BuyerOrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private BuyerService buyerService;

    //创建订单  注意：BindingResult 对象必须在 @Valid 的紧挨着的后面，否则接收不到错误信息。
    @PostMapping("/create")
    public ResultVO<Object> create(@Valid OrderForm orderForm,
                                   BindingResult bindingResult) {
        System.out.println(orderForm);

        if (bindingResult.hasErrors()) {
            log.error("【创建订单】参数不正确,orderForm={}", orderForm);
            throw new SellException(ResultEnum.PARAM_ERROR.getCode(),
                    bindingResult.getFieldError().getDefaultMessage());
        }

        OrderDTO orderDTO = OrderForm2OrderDTOConverter.convert(orderForm);
        if (CollectionUtils.isEmpty(orderDTO.getOrderDetailList())) {
            log.error("【创建订单】 购物车不能为空");
            throw new SellException(ResultEnum.CART_EMPTY);
        }
        OrderDTO createResult = orderService.create(orderDTO);
        Map<String, String> map = new HashMap<>();
        map.put("orderId", createResult.getOrderId());

        return ResultVOUtil.success(map);

    }

    //订单列表
    @GetMapping("/list")
    public ResultVO<Object> List(@RequestParam("openid") String openid,
                                 @RequestParam(value = "page", defaultValue = "0") Integer page,
                                 @RequestParam(value = "size", defaultValue = "10") Integer size) {

        if (StringUtils.isEmpty(openid)) {
            log.error("【查询订单列表】openid 为空");
            throw new SellException(ResultEnum.PARAM_ERROR);
        }
        PageRequest request = new PageRequest(page, size);
        Page<OrderDTO> orderDTOPage = orderService.findList(openid, request);

        return ResultVOUtil.success(orderDTOPage.getContent());
    }


    //订单详情
    @GetMapping("/detail")
    public ResultVO<Object> detail(@RequestParam("openid") String openid,
                                   @RequestParam("orderId") String orderId) {

        /* //TODO 不安全的做法 改进
        OrderDTO orderDTO = orderService.findOne(orderId);
        if(!orderDTO.getBuyerOpenid().equalsIgnoreCase(openid)){

        }*/

        OrderDTO orderDTO = buyerService.findOrderOne(openid, orderId);
        return ResultVOUtil.success(orderDTO);

    }

    //取消订单
    @PostMapping("/cancel")
    public ResultVO cancel(@RequestParam("openid") String openid,
                           @RequestParam("orderId") String orderId) {
      /*  //TODO 不安全的做法 改进
        OrderDTO orderDTO = orderService.findOne(orderId);
        orderService.cancel(orderDTO);*/
        buyerService.cancelOrder(openid, orderId);
        return ResultVOUtil.success();
    }

}
