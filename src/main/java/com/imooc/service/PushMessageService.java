package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * @auther jiahaowei
 * @date： 2017/12/20 0020
 * @time： 10:12
 * @project_name： mc_springboot_dinner
 * @Description ：消息推送
 */
public interface PushMessageService {

    /**
     * 订单变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
