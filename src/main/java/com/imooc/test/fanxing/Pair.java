package com.imooc.test.fanxing;

/**
 * @auther jiahaowei
 * @date： 2017/12/14 0014
 * @time： 10:49
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
public class Pair<T,z> {
    private T first;
    private z second;

    public Pair() {
    }

    public Pair(T first, z second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public z getSecond() {
        return second;
    }

    public void setFirst(T newValue) {
        first = newValue;
    }

    public void setSecond(z newValue) {
        second = newValue;
    }
}
