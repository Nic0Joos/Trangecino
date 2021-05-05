package com.time.trangecino.business.service;

import com.time.trangecino.Data.Domain.Employee;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

//Written by Luca
@Service
public class EmployeeService {


    //add Employee
    public Employee addEmployee (Employee employee){

    }

    //edit Employee
public Employee editEmployee(@Validated Employee employee) throws Exception {
    if (employee.getID() == 0) {
        }
        throw new Exception("No employee found");
    }

    //delete Employee
    public void deleteEmployee (Employee employee) throws Exception {
            if (Employee.getID() == null) {
            }
            throw new Exception("No employee found");
    }
}