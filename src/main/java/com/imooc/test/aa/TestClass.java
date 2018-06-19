package com.imooc.test.aa;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @auther jiahaowei
 * @date： 2017/12/12 0012
 * @time： 10:36
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
public class TestClass {
    public static void main(String[] args) throws Exception
    {
        SerialClass s = new SerialClass();
        s.setA(10);
        s.setB("hello");
        s.setC("world");
//创建ObjectOutputStream对象，准备序列化对象s
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("abc"));
//调用writeObject将对象进行序列化，存储在文件abc中。
        oos.writeObject(s);
        oos.flush();
        oos.close();

//创建ObjectInputStream对象，准备从文件abc中反序列化SerialClass对象
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("abc"));
//调用readObject将存储在文件abc中的字节流反序列化为SerialClass对象。
        s = (SerialClass) ois.readObject();
        System.out.println(s.getA());
        System.out.println(s.getB());
        System.out.println(s.getC());
    }
}
