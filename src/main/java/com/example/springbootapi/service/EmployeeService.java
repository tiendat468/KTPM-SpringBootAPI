package com.example.springbootapi.service;

import com.example.springbootapi.entity.Employee;


import java.util.List;

public interface EmployeeService{
    public void saveEmployee(Employee employee);
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(int id);
    public void deleteEmployeeById(int id);
    public void updateEmployee(Employee employee);

}
