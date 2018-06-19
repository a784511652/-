package com.imooc;

/**
 * @auther jiahaowei
 * @date： 2017/10/20 0020
 * @time： 10:15
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
class Person1 {
    public String name="xiaomiao";
    public int age=20;

    public Person1() {
    }

}

class Student extends Person1 {
    Student() {
        super();
    }

    void study() {
        System.out.println("I can study!"+"--"+super.age);
    }
}

public class JiCheng {
    public static void main(String args[]) {
        Student stu = new Student();
        stu.study();
        //stu.name = "zhangsan";
        //stu.age = 20;
        System.out.println("姓名:" + stu.name + "\n" + "年龄:" + stu.age);
    }
}