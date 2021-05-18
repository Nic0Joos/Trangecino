package com.time.trangecino.business.service;

import com.time.trangecino.Data.Domain.Employee;
import com.time.trangecino.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

//Written by Luca
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    //add and save Employee
    public void addEmployee(@Valid Employee employee) throws Exception {
        if (employee.getID() == null) {
            if (employeeRepository.findByEmail(employee.getEmail()) != null) {
                throw new Exception("Please enter a new email address");
            }
        }
        employee.setPassword(passwordEncoder.encode(employee.getPassword()));
        employeeRepository.save(employee);
    }

    //edit Employee
    public Employee editEmployee(@Valid Employee employee) throws Exception {
        if (employee.getID() == null) {
            throw new Exception("No employee found");
        } else {
            return employeeRepository.save(employee);
        }
    }


        //delete Employee
        public void deleteEmployee (Employee customerId){
            employeeRepository.deleteById(customerId);
        }
}
