package com.example.springbootapi.controller;

import com.example.springbootapi.entity.Employee;
import com.example.springbootapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable("id") int id){
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public String saveEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return "Finished!!";
    }

    @DeleteMapping("/{id}")
    public String deleteEmployeeById(@PathVariable("id") int id){
        employeeService.deleteEmployeeById(id);
        return "Finished!!";
    }

    @PutMapping("/{id}")
    public String updateEmployee(@RequestBody Employee employee){
        employeeService.updateEmployee(employee);
        return "Finished!!";
    }
}
