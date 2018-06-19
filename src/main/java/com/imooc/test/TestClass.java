package com.imooc.test;

import java.io.*;

/**
 * @auther jiahaowei
 * @date： 2017/12/12 0012
 * @time： 10:36
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
public class TestClass implements Serializable {

    private static final long serialVersionUID = 1L;

    public static int staticVar = 5;

    public Integer a=10;

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public static void main(String[] args) {
        TestClass testClass =new TestClass();
        try {
            //初始时staticVar为5
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream("result.obj"));
            out.writeObject(testClass);
            out.close();

            testClass.setA(5);

            //序列化后修改为10
            TestClass.staticVar = 10;
            ObjectInputStream oin = new ObjectInputStream(new FileInputStream(
                    "result.obj"));
            TestClass t = (TestClass) oin.readObject();
            oin.close();

            //再读取，通过t.staticVar打印新的值
            System.out.println(t.getA());
            System.out.println(testClass.getA());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
   /* public static void main(String[] args) throws Exception
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
    }*/
}
