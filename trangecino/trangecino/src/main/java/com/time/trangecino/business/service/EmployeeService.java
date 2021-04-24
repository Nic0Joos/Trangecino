package com.time.trangecino.business.service;

import com.time.trangecino.Data.Domain.Employee;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

//Written by Luca
@Service
public class EmployeeService {


    //add Employee
    public Employee addEmployee (){

    }

    //edit Employee
public Employee editEmployee(@Validated Employee employee) throws Exception {
    if (employee.getID() == null) {
        }
        throw new Exception("No employee found");
    }

    //delete Employee
    public void deleteEmployee (int ID) throws Exception {
            if (deleteEmployee().getID() == null) {
            }
            throw new Exception("No employee found");
    }
}
