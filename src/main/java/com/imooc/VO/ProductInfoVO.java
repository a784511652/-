package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @auther jiahaowei
 * @date： 2017/9/15 0015
 * @time： 14:07
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
@Data
public class ProductInfoVO {
    private String productId;

    //  名字
    @JsonProperty("name")
    private String productName;

    //  单价
    @JsonProperty("price")
    private BigDecimal productPrice;


    //  描述
    @JsonProperty("description")
    private  String productDescription;

    //  小图
    @JsonProperty("icon")
    private String productIcon;
}
