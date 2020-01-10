package com.example.mapper;

import com.example.bean.Employee;



public interface EmployeeMapper {
    public Employee getEmp(Integer id);
    public void insertEmp(Employee employee);
}
