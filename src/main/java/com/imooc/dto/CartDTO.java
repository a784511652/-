package com.imooc.dto;

import lombok.Data;

/**
 * @auther jiahaowei
 * @date： 2017/10/14 0014
 * @time： 21:42
 * @project_name： mc_springboot_dinner
 * @Description ：购物车
 */
@Data
public class CartDTO {

    //商品ID
    private String productId;

    //数量
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
