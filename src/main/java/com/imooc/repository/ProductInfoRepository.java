package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @auther jiahaowei
 * @date： 2017/9/12 0012
 * @time： 16:13
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String>{
    List<ProductInfo> findByProductStatus(Integer productStatus);


}
