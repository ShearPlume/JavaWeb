package com.example.webstarter.controller;

import com.example.webstarter.pojo.Address;
import com.example.webstarter.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ResponceController {

//    @RequestMapping("/hello")
//    public String hello() {
//        System.out.println("Hello World");
//        return "hello world";
//    }
//
//    @RequestMapping("/getAddr")
//    public Address getAddr() {
//        Address add = new Address();
//        add.setCity("Chengdu");
//        add.setProv("SiChuan");
//        return add;
//    }
//
//    @RequestMapping("/listAddr")
//    public List<Address> listAddr() {
//        List<Address> addrs = new ArrayList<Address>();
//        Address add1 = new Address();
//        add1.setCity("Chengdu");
//        add1.setProv("SiChuan");
//        Address add2 = new Address();
//        add2.setCity("Guangzhou");
//        add2.setProv("GuangDong");
//        addrs.add(add1);
//        addrs.add(add2);
//        return addrs;
//    }
    //返回result：
@RequestMapping("/hello")

public Result hello() {
    System.out.println("Hello World");
    String data="hello world";
    return Result.success(data);
}

    @RequestMapping("/getAddr")
    public Result getAddr() {
        Address add = new Address();
        add.setCity("Chengdu");
        add.setProv("SiChuan");
        return Result.success(add);
    }

    @RequestMapping("/listAddr")
    public Result listAddr() {
        List<Address> addrs = new ArrayList<Address>();
        Address add1 = new Address();
        add1.setCity("Chengdu");
        add1.setProv("SiChuan");
        Address add2 = new Address();
        add2.setCity("Guangzhou");
        add2.setProv("GuangDong");
        addrs.add(add1);
        addrs.add(add2);
        return Result.success(addrs);
    }
}
