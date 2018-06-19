package com.imooc.utils;

import java.util.Random;

/**
 * @auther jiahaowei
 * @date： 2017/9/20 0020
 * @time： 14:17
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
public class KeyUtil {

    /**
     *生成唯一主键
     *格式：时间+随机数
     */

    public static synchronized String genUniqueKey() {
        Random random = new Random();

        Integer number = random.nextInt(900000)+100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }

    public static void main(String[] args) {

        for (int i = 0; i <10 ; i++) {
            Random random = new Random();
            Integer number = random.nextInt(900000);
            Integer number1 = number +100000;

            System.out.println(number);
            System.out.println(number1);
            System.out.println();
        }

    }

}
