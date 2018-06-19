package com.imooc.test.bb;

import java.io.Serializable;

/**
 * @auther jiahaowei
 * @date： 2017/12/12 0012
 * @time： 13:12
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
public class A implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
