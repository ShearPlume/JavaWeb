package com.example.webstarter.controller;

import com.example.webstarter.pojo.Simplepojo;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {
    @RequestMapping("/hello1")
    public String hello1(){
        System.out.println("hello world~");
        return "Hello World!";
    }

    @RequestMapping("/no1")
    public int no1()
    {
        return 100;

    }

    @RequestMapping("/sq")
    public String sq(HttpServletRequest req)
    {
        String name =req.getParameter("name");
        String age=req.getParameter("age");
        String hobby=req.getParameter("hobby");
        System.out.println(name+" : "+age+" : "+hobby);
        return "200";

    }
    @RequestMapping("/sq1")

    public String sq1(    @RequestParam(name="name")String usrname,Integer age,String hobby)
    {
        System.out.println(usrname+" : "+age+" : "+hobby);
        return "200";

    }
@RequestMapping("/list")
    public String listParam(@RequestParam List<String> hobby){
        System.out.println(hobby);
        return  "OK";
    }
    @RequestMapping("/array")
    public String arrayParam(String[] name){
        System.out.println(Arrays.toString(name));
        return  "OK";
    }

    @RequestMapping("/simplePojo")
        public String simplePojho(Simplepojo sp){
        System.out.println(sp);
        return  "OK!";
    }

    @RequestMapping("/path/{id}/{name}/{hobby}")
    public String pathValueDemo(@PathVariable Integer id,@PathVariable String name,@PathVariable String hobby){
        System.out.println(name+" "+id+" "+hobby);
        return "OK";
    }
}
