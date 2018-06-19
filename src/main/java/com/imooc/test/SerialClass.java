package com.imooc.test;

import java.io.Serializable;

/**
 * @auther jiahaowei
 * @date： 2017/12/12 0012
 * @time： 10:31
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
public class SerialClass implements Serializable {

    private static final long serialVersionUID = -2164517031603241860L;
    private String c;
    public int a;
    private String b;

    public int getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
}