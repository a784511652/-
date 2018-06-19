package com.imooc.enums;

import lombok.Getter;

import java.util.Objects;

/**
 * @auther jiahaowei
 * @date： 2017/9/19 0019
 * @time： 8:59
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
@Getter
public enum OrderStatusEnum implements CodeEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消");
    private Integer code;
    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

 /*   public static OrderStatusEnum getOrderStatusEnum(Integer code) {
        for (OrderStatusEnum orderStatusEnum : OrderStatusEnum.values()) {
            if (Objects.equals(code, orderStatusEnum.getCode())) {
                return orderStatusEnum;
            }
        }
        return null;
    }*/
}
