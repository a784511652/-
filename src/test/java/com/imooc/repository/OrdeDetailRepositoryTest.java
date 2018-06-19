package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @auther jiahaowei
 * @date： 2017/9/19 0019
 * @time： 11:50
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrdeDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("123456789");
        orderDetail.setOrderId("1111111");
        orderDetail.setProductIcon("http://xxx.jpg");
        orderDetail.setProductId("1111111111112");
        orderDetail.setProductName("皮蛋粥");
        orderDetail.setProductPrice(new BigDecimal(1.2));
        orderDetail.setProductQuantity(2);

        OrderDetail result =  repository.save(orderDetail);
        Assert.assertNotNull(result);
    }
    @Test
    public void findByOrderId() throws Exception {
        List<OrderDetail>orderDetailList =  repository.findByOrderId("1111111");
        Assert.assertNotEquals(0,orderDetailList.size());
    }

}