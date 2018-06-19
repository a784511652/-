package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @auther jiahaowei
 * @date： 2017/9/11 0011
 * @time： 14:55
 * @project_name： mc_springboot_dinner
 * @Description ：
 */

public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {


    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);



}
