package com.imooc.test.aa;

import com.imooc.test.AbsSuperClass;

import java.io.Serializable;

/**
 * @auther jiahaowei
 * @date： 2017/12/12 0012
 * @time： 10:55
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
public class SerialClass extends AbsSuperClass implements Serializable {
    private static final long serialVersionUID = 1L;
    private String c;

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
}