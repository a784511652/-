package com.imooc.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.imooc.dataobject.OrderDetail;
import com.imooc.dto.OrderDTO;
import com.imooc.enums.ResultEnum;
import com.imooc.exception.SellException;
import com.imooc.form.OrderForm;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @auther jiahaowei
 * @date： 2017/10/25 0025
 * @time： 11:38
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
@Slf4j
public class OrderForm2OrderDTOConverter {
    public static OrderDTO convert(OrderForm orderForm) {
        Gson gson = new Gson();
        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());
        List<OrderDetail> orderDetailList = new ArrayList<>();
        try {
            orderDetailList = gson.fromJson(orderForm.getItems(),
                    new TypeToken<List<OrderDetail>>() {
                    }.getType());
        } catch (Exception e) {
            log.error("【对象转换】错误,String={}", orderForm.getItems());
            throw new SellException(ResultEnum.PARAM_ERROR);
        }
        orderDTO.setOrderDetailList(orderDetailList);
        return orderDTO;

        // BeanUtils.copyProperties();  OrderDTO与OrderForm字段名字不一样  所以不能进行复制
    }

    public static void main(String[] args) {

        String contentStr ="{\n" +
                "    \"groupName\": \"taskGroup1\",\n" +
                "    \"jobName\": \"job1\",\n" +
                "    \"method\": \"POST\",\n" +
                "    \"contentType\": \"application/json\",\n" +
                "    \"content\": \"{\\\"app\\\":\\\"123\\\"}\",\n" +
                //动态设置时间
                "    \"callbackUrl\": \"http://api.com/receive \"\n" + "}";

        Gson gson = new Gson();
       // Map map = gson.fromJson(contentStr,new TypeToken<HashMap>(){}.getType());
        Map<String,Object> map = new Gson().fromJson(contentStr, new TypeToken<HashMap<String,Object>>(){}.getType());
        System.out.println(map);


    }

}
