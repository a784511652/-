package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @auther jiahaowei
 * @date： 2017/9/19 0019
 * @time： 10:48
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {

    List<OrderDetail> findByOrderId(String orderId);



}
