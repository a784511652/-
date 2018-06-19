package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @auther jiahaowei
 * @date： 2017/9/11 0011
 * @time： 15:04
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory = repository.findOne(9);
        System.out.println(productCategory.toString());
    }

    @Test
    public void saveTest(){
        ProductCategory productCategory = repository.findOne(8);
        productCategory.setCategoryType(3);
        repository.save(productCategory);
    }
    @Test
   // @Transactional
    public void saveTest2(){
        ProductCategory productCategory = new ProductCategory("男生最爱",2);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
        //Assert.assertNotEquals(null,result);与上面意思一样
    }
    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(1,2,4);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
       // repository.findByCategoryTypeIn();
    }




}