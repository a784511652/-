package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * @auther jiahaowei
 * @date： 2017/10/26 0026
 * @time： 8:50
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid,String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid,String orderId);
}
