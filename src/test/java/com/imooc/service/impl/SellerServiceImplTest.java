package com.imooc.service.impl;

import com.imooc.config.WechatAccountConfig;
import com.imooc.dataobject.SellerInfo;
import com.lly835.bestpay.utils.JsonUtil;
import lombok.extern.slf4j.Slf4j;
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
 * @time： 13:27
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SellerServiceImplTest {

    private static final String openid="abc";

    @Autowired
    private SellerServiceImpl sellerService;

    @Autowired
    private WechatAccountConfig wechatAccountConfig;

    @Test
    public void test(){
        System.out.println(JsonUtil.toJson(wechatAccountConfig));
    }

    @Test
    public void findSellerInfoByOpenid() throws Exception {
        SellerInfo result = sellerService.findSellerInfoByOpenid(openid);
        Assert.assertEquals(openid,result.getOpenid());
    }

}