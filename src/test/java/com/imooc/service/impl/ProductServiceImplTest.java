package com.imooc.service.impl;

import com.imooc.dataobject.ProductInfo;
import com.imooc.enums.ProductStatusEnum;
import com.imooc.repository.ProductInfoRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @auther jiahaowei
 * @date： 2017/9/14 0014
 * @time： 15:00
 * @project_name： mc_springboot_dinner
 * @Description ：
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {


    @Autowired
    private ProductServiceImpl productService;


    @Test
    public void findOne() throws Exception {
      ProductInfo productInfo = productService.findOne("123456");
        Assert.assertEquals("123456",productInfo.getProductId());

    }

    @Test
    public void findUpAll() throws Exception {
       List<ProductInfo> productInfos =  productService.findUpAll();
       Assert.assertNotEquals(0,productInfos.size());
    }

    @Test
    public void findAll() throws Exception {
        Pageable pageable = new PageRequest(0,1);
        Page<ProductInfo> productInfoPage = productService.findAll(pageable);
        System.out.println(productInfoPage.getTotalElements());
        Assert.assertNotEquals(0,productInfoPage.getTotalElements());
    }

    @Test
    public void save() throws Exception {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123457");
        productInfo.setProductName("皮皮虾");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好喝的虾");
        productInfo.setProductIcon("http://xxxxx.jpg");
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setCategoryType(2);

        ProductInfo result = productService.save(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void onSale(){
        ProductInfo result = productService.onSale("123456");
        System.out.println(ProductStatusEnum.UP);
        System.out.println(result.getProductStatusEnum());
        Assert.assertEquals(ProductStatusEnum.UP,result.getProductStatusEnum());

    }

    @Test
    public void offSale(){
        ProductInfo result = productService.offSale("123456");
        Assert.assertEquals(ProductStatusEnum.DOWN,result.getProductStatusEnum());

    }


}