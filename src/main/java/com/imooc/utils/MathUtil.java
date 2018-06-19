package com.imooc.utils;

/**
 * @auther jiahaowei
 * @date： 2017/11/15 0015
 * @time： 15:37
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
public class MathUtil {
    private static final Double MONEY_RANGE = 0.01;

    /**
     * 比较两个金额是否相等
     *
     * @param d1
     * @param d2
     * @return
     */
    public static Boolean equals(Double d1, Double d2) {
        Double result = Math.abs(d1 - d2);
        return result < MONEY_RANGE;

    }
}
