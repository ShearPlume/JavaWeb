package test;

import com.example.webstarter.Service.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);
        System.out.println(result);
        String str = "abc";
        //反射的好处1.在运行过程中操作对象2.解耦
        //获取class对象的方式：
//        1.Class.forName(" 全类名");(源代码阶段)
//        2.类名.class:类名的class属性获取
//        3.对象.getClass();
        //断言
        Assert.assertEquals(-1, result);
    }

    //用于申请资源
    @Before//所有测试方法都会先执行
    public void init() {
        System.out.println("start");
    }

    @After//所有方法执行完后自动执行
    public void close() {
        System.out.println("close");
    }

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);
        System.out.println(result);
        //断言
        Assert.assertEquals(-1, result);

    }

    @Test
    public void testDev() {
        Calculator calculator = new Calculator();
        int result = calculator.dev(4, 2);
        System.out.println(result);
        //断言
        Assert.assertEquals(2, result);
    }
}
