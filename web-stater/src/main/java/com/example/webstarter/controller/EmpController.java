package com.example.webstarter.controller;

import com.example.webstarter.Service.EmpSvc;
import com.example.webstarter.Service.impl.EmpSvcImpl;
import com.example.webstarter.pojo.Emp;
import com.example.webstarter.pojo.Result;
import com.example.webstarter.utils.XmlParserUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {
    private EmpSvc empsvc=new EmpSvcImpl();
    @RequestMapping("/listEmp")
    public Result listEmp(){
        //1.加载并解析xml
        //2.对数据进行转换处理
        //3.响应数据
//        String filePath= this.getClass().getClassLoader().getResource("emp.xml").getFile();
//        System.out.println(filePath);
//        List<Emp> empList=XmlParserUtils.parse(filePath,Emp.class);
        //↑数据访问Dao（持久层）

//        empList.stream().forEach(emp->{
//            //处理gender
//            String gender=emp.getGender();
//            if (gender.equals("1")){
//                emp.setGender("male");
//            }
//            else
//                emp.setGender("female");
//
//            String job=emp.getJob();
//            if (job.equals("1")){
//                emp.setJob("Teacher");
//            }
//            else if (job.equals("2")){
//                emp.setJob("Mentor");
//            }
//            else if(job.equals("3")){
//                emp.setJob("Lecturer");
//            }
//        });

        //↑逻辑处理Service

        return Result.success(empsvc.listEmp());
        //↑接受请求，响应数据Controller
    }
}
