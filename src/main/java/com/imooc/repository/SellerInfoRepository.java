package com.imooc.repository;

import com.imooc.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @auther jiahaowei
 * @date： 2017/12/15 0015
 * @time： 10:13
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
public interface SellerInfoRepository extends JpaRepository<SellerInfo,String> {
       SellerInfo findByOpenid(String openid);
}
