package com.imooc.dataobject.dao;

import com.imooc.dataobject.mapper.ProductCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * @auther jiahaowei
 * @date： 2017/12/22 0022
 * @time： 9:02
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
public class ProductCategoryDao {

    @Autowired
    ProductCategoryMapper mapper;

    public int insertByMap(Map<String, Object> map) {
        return mapper.insertByMap(map);
    }
}
