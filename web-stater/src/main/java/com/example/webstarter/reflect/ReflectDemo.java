package com.example.webstarter.reflect;

import com.example.webstarter.pojo.Person;

public class ReflectDemo {
    //获取class对象的方式：
//        1.Class.forName(" 全类名");(源代码阶段)多数用于配置文件，类名定义在配置文件中读取加载文件
//        2.类名.class:类名的class属性获取，多用于参数的传递
//        3.对象.getClass();，多用于对象的获取字节码方式
    //断言

    public static void main(String[] args)throws Exception {
        //方式1：


        Class pclass = Class.forName("com.example.webstarter.pojo.Person");
    System.out.println(pclass);



        //way2:
        Class cls2= Person.class;
        System.out.println(cls2);
        //way3:
        Person p1=new Person();
        Class cls3=p1.getClass();
        System.out.println(cls3);


    }


}
