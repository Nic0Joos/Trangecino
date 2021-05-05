package com.time.trangecino.Endpoint;

import com.time.trangecino.Data.Domain.Employee;
import com.time.trangecino.business.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//written by Luca

@RestController
@RequestMapping(path= "/employee")
public class EmployeeEndpoint {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeEndpoint(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public void postEmployee(/*@RequestBody?*/ Employee employee) {
        employeeService.addEmployee(employee);
    }

    @PutMapping
    public void editEmployee(Employee employee){
        try {
            employeeService.editEmployee(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @DeleteMapping
    public void deleteEmployee(Employee employee){
        try {
            employeeService.deleteEmployee(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    }

