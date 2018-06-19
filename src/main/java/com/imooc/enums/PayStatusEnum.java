package com.imooc.enums;

import lombok.Getter;

/**
 * @auther jiahaowei
 * @date： 2017/9/19 0019
 * @time： 9:12
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
@Getter
public enum PayStatusEnum implements CodeEnum{

    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功");

    private Integer code;

    private String  message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
