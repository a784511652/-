package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @auther jiahaowei
 * @date： 2017/9/19 0019
 * @time： 10:30
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String>{

    Page<OrderMaster>findByBuyerOpenid(String buyerOpenid, Pageable pageable);


}
