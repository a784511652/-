package com.imooc.dataobject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.imooc.enums.ProductStatusEnum;
import com.imooc.utils.EnumUtil;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @auther jiahaowei
 * @date： 2017/9/12 0012
 * @time： 15:41
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
@Entity
@Data
@DynamicUpdate
public class ProductInfo {

    @Id
    private String productId;

    //  名字
    private String productName;

    //  单价
    private BigDecimal productPrice;

    //  库存
    private  Integer productStock;

    //  描述
    private  String productDescription;

    //  小图
    private String productIcon;

    //  状态 0正常1下架
    private Integer productStatus = ProductStatusEnum.UP.getCode();

    //  状态 0正常1下架
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    @JsonIgnore
    public ProductStatusEnum getProductStatusEnum(){
        return EnumUtil.getByCode(productStatus,ProductStatusEnum.class);
    }






}