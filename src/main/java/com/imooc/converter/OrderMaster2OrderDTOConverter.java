package com.imooc.converter;

import com.imooc.dataobject.OrderMaster;
import com.imooc.dto.OrderDTO;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @auther jiahaowei
 * @date： 2017/10/19 0019
 * @time： 17:19
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
public class OrderMaster2OrderDTOConverter {

    public static OrderDTO convert(OrderMaster orderMaster) {

        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster, orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList) {
        return orderMasterList.stream().map(e -> convert(e)).collect(Collectors.toList());

       /* return orderMasterList.stream().map(OrderMaster2OrderDTOConverter::convert
        ).collect(Collectors.toList());*/
    }
}
