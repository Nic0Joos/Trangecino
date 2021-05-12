package com.time.trangecino.business.service;

import com.time.trangecino.Data.Domain.Employee;
import com.time.trangecino.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

//Written by Luca
@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    //add Employee
    public void addEmployee (Employee employee){

    }

    //edit Employee
public Employee editEmployee(@Validated Employee employee) throws Exception {
    if (employee.getID() == 0) {
        }
        throw new Exception("No employee found");
    }

    //delete Employee
    public void deleteEmployee (Employee employee) throws Exception {
            if (employee.getID() == 0) {
            }
            throw new Exception("No employee found");
    }
}