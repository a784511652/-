package com.imooc.test.bb;


import java.io.*;

/**
 * @auther jiahaowei
 * @date： 2017/12/13 0013
 * @time： 10:15
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
public class test implements Serializable {

    private static final long serialVersionUID = 1L;
    private String password = "pass";
    private Integer i=0;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private void writeObject(ObjectOutputStream out) {
        try {
            ObjectOutputStream.PutField putField = out.putFields();
            System.out.println("原密码:" + password);
            password = "encrytion";//模拟加密
            putField.put("password", password);
            System.out.println("加密后的密码" + password);
            out.writeFields();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream in) {
        try {
            ObjectInputStream.GetField readFields = in.readFields();
            Object object = readFields.get("password", "");
            System.out.println("要解密的字符串:" + object.toString());
            password = "pass";//模拟解密,需要获得本地的密钥
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("result.obj"));
        test test = new test();
        test.i = 1;
        out.writeObject(test);
        out.flush();
        test.i = 2;
        out.writeObject(test);
        out.close();
        ObjectInputStream oin = new ObjectInputStream(new FileInputStream(
                "result.obj"));
        test t1 = (test) oin.readObject();
        test t2 = (test) oin.readObject();
        System.out.println(t1.i);
        System.out.println(t2.i);
        //---2
        /*
       ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(
                    new FileOutputStream("result.obj"));

            test test = new test();
            //试图将对象两次写入文件
            out.writeObject(test);
            out.flush();
            System.out.println(new File("result.obj").length());
            out.writeObject(test);
            out.close();
            System.out.println(new File("result.obj").length());

            ObjectInputStream oin = new ObjectInputStream(new FileInputStream(
                    "result.obj"));
            //从文件依次读出两个文件
            test t1 = (test) oin.readObject();
            test t2 = (test) oin.readObject();
            oin.close();

            //判断两个引用是否指向同一个对象
            System.out.println(t1 == t2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        //----1
       /* try {
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream("result.obj"));
            out.writeObject(new test());
            out.flush();
            out.close();

            ObjectInputStream oin = new ObjectInputStream(new FileInputStream(
                    "result.obj"));
            test t = (test) oin.readObject();
            System.out.println("解密后的字符串:" + t.getPassword());
            oin.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }*/
    }
}
