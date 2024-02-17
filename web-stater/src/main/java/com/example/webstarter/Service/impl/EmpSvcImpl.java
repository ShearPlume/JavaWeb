package com.example.webstarter.Service.impl;

import com.example.webstarter.Dao.EmpDao;
import com.example.webstarter.Dao.impl.EmpDaoImpl;
import com.example.webstarter.Service.EmpSvc;
import com.example.webstarter.pojo.Emp;

import java.util.List;

public class EmpSvcImpl implements EmpSvc {
    private EmpDao empDao=new EmpDaoImpl();
    @Override
    public List<Emp> listEmp() {
        List<Emp> empList=empDao.listEmp();
        empList.stream().forEach(emp->{
            //处理gender
            String gender=emp.getGender();
            if (gender.equals("1")){
                emp.setGender("male");
            }
            else
                emp.setGender("female");

            String job=emp.getJob();
            if (job.equals("1")){
                emp.setJob("Teacher");
            }
            else if (job.equals("2")){
                emp.setJob("Mentor");
            }
            else if(job.equals("3")){
                emp.setJob("Lecturer");
            }
        });
        return empList;
    }
}
