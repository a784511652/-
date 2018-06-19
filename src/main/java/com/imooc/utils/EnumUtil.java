package com.imooc.utils;

import com.imooc.enums.CodeEnum;

/**
 * @auther jiahaowei
 * @date： 2017/11/21 0021
 * @time： 14:24
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
public class EnumUtil {

    //todo 查看
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each : enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
