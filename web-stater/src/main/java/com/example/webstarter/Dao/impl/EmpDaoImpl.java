package com.example.webstarter.Dao.impl;

import com.example.webstarter.Dao.EmpDao;
import com.example.webstarter.pojo.Emp;
import com.example.webstarter.utils.XmlParserUtils;

import java.util.List;

public class EmpDaoImpl implements EmpDao {


    @Override
    public List<Emp> listEmp() {
        String filePath= this.getClass().getClassLoader().getResource("emp.xml").getFile();
        System.out.println(filePath);
        List<Emp> empList= XmlParserUtils.parse(filePath,Emp.class);
        return empList;
    }
}
