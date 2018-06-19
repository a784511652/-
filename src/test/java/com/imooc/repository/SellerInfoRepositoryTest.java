package com.imooc.repository;

import com.imooc.dataobject.SellerInfo;
import com.imooc.utils.KeyUtil;
import com.lly835.bestpay.utils.JsonUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @auther jiahaowei
 * @date： 2017/12/15 0015
 * @time： 10:19
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SellerInfoRepositoryTest {

    @Autowired
    private SellerInfoRepository sellerInfoRepository;

    @Test
    public void save(){
        SellerInfo sellerInfo = new SellerInfo();
        sellerInfo.setSellerId(KeyUtil.genUniqueKey());
        sellerInfo.setUsername("admin");
        sellerInfo.setPassword("admin");
        sellerInfo.setOpenid("abc");

        System.out.println(JsonUtil.toJson(sellerInfo));
        SellerInfo result = sellerInfoRepository.save(sellerInfo);

        Assert.assertNotNull(result);
    }

    @Test
    public void findByOpenid() throws Exception {

        SellerInfo result = sellerInfoRepository.findByOpenid("abc");
        Assert.assertEquals("abc",result.getOpenid());

    }

}