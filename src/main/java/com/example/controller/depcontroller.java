package com.example.controller;

import com.example.bean.Employee;
import com.example.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class depcontroller {
    @Autowired
    EmployeeMapper employeeMapper;

@GetMapping("/emp/{id}")
    public Employee getEmpId(@PathVariable("id") Integer id){
        return employeeMapper.getEmp(id);
    }
}
