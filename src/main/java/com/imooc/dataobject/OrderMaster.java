package com.imooc.dataobject;

import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @auther jiahaowei
 * @date： 2017/9/18 0018
 * @time： 11:20
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
@Entity
@Data
@DynamicUpdate
public class OrderMaster {

    //订单ID
    @Id
    private String orderId;

    //买家名字
    private String buyerName;

    //买家手机号
    private String buyerPhone;

    //买家地址
    private String buyerAddress;

    //买家微信Openid
    private String buyerOpenid;

    //订单总金额
    private BigDecimal orderAmount;

    //订单状态  默认为新下单
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    //支付状态 默认为0未支付
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    //创建时间
    private Date creatTime;

    //更新时间
    private Date updateTime;


    //第一种方法（使数据库忽略对比）  第二种 建立dto 数据传输所用
   /* @Transient
    private List<OrderDetail>orderDetailList;*/


}
