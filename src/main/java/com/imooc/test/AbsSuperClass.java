package com.imooc.test;

import java.io.Serializable;

/**
 * @auther jiahaowei
 * @date： 2017/12/12 0012
 * @time： 10:51
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
public abstract class AbsSuperClass implements SuperInterface,Serializable {
    public  int a;
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

    public AbsSuperClass() {
    }
}