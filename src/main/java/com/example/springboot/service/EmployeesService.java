package com.example.springboot.service;

import com.example.springboot.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by colin on 2018/6/2.
 */
@Service
public class EmployeesService {

    public List<Employee> getEmployeesService() {
        return testGetEmployees();
    }
    //没有创建数据库，模拟了数据
    private List<Employee> testGetEmployees() {
        ArrayList<Employee> arrayList = new ArrayList<>();
        Employee xiaoming = new Employee(1,"小明",20,"男");
        Employee xiaohong = new Employee(1,"小红",19,"男");
        Employee xiaolan = new Employee(1,"小蓝",18,"女");
        Employee xiaolv = new Employee(1,"小绿",2,"男");
        arrayList.add(xiaoming);
        arrayList.add(xiaohong);
        arrayList.add(xiaolan);
        arrayList.add(xiaolv);
        return arrayList;
    }
}
