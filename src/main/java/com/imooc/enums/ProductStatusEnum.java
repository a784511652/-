package com.imooc.enums;

import lombok.Data;
import lombok.Getter;

/**
 * @auther jiahaowei
 * @date： 2017/9/14 0014
 * @time： 14:12
 * @project_name： mc_springboot_dinner
 * @Description ：商品状态
 */
@Getter
public enum ProductStatusEnum implements CodeEnum {

    UP(0,"在架"),
    DOWN(1,"下架");

    private Integer code;
    private String  message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
