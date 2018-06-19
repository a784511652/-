package com.imooc.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @auther jiahaowei
 * @date： 2017/12/14 0014
 * @time： 9:30
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
public class fanxingtest<T> {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        fanxingtest<String> fa = new fanxingtest<>();
        fa.printColl(list);

    }

    private void printColl(List<T> al) {
        Iterator<?> it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }

    private static void aa(ArrayList<?> al) {
        Iterator<?> it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}
