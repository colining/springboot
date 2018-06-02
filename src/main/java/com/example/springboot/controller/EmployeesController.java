package com.example.springboot.controller;

import com.example.springboot.model.Employee;
import com.example.springboot.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by colin on 2018/6/2.
 */
@RestController
public class EmployeesController {
    @Autowired
    private EmployeesService employeesService;
    @RequestMapping("/employees")
    public List<Employee> index() {
        return employeesService.getEmployeesService();
    }
}