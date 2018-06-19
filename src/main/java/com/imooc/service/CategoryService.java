package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import java.util.List;

/**
 * @auther jiahaowei
 * @date： 2017/9/12 0012
 * @time： 11:06
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
public interface CategoryService {
    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();


    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);


    ProductCategory save(ProductCategory productCategory);

}
