package com.time.trangecino.business.service;

import com.time.trangecino.Data.Domain.Employee;
import com.time.trangecino.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

//Written by Luca
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    //add Employee
    public void addEmployee (Employee employee){
        try {
            if (employee.getID() == 0) {
                if (employeeRepository.findByEmail(employee.getEmail()) != null) {
                    throw new Exception("Please enter a new email address");
                } else {
                    employee.setPassword(passwordEncoder.encode(employee.getPassword()));
                }
            } else {
                employee.setPassword(passwordEncoder.encode(
                        employeeRepository.findById(employee.getID()).get().getPassword()));
            }
        } catch (NullPointerException ne) {
            try {
                throw new Exception("Not logged in.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        employeeRepository.save(employee);
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