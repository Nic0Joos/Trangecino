package com.time.trangecino.business.service;

import com.time.trangecino.Data.Domain.Employee;
import com.time.trangecino.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

//Written by Luca Weisskopf
@Service
@Validated
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    PasswordEncoder passwordEncoder;

    //add and save employee
    public void addEmployee(@Valid Employee employee) throws Exception {
        if (employee.getEmployeeID() == null) {
            if (employeeRepository.findByEmail(employee.getEmail()) != null) {
                throw new Exception("Please enter a new email address");
            }
        }
        employee.setPassword(passwordEncoder.encode(employee.getPassword()));
        employeeRepository.save(employee);
    }

    //edit employee
    public Employee editEmployee(@Valid Employee employee) throws Exception {
        if (employee.getEmployeeID() == null) {
            throw new Exception("No employee found");
        } else {
            return employeeRepository.save(employee);
        }
    }

    //delete employee
    public void deleteEmployee (Long EmployeeID){
            employeeRepository.deleteById(EmployeeID);
        }


    //find all employees
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    //find one specific employee
    public Employee findEmployeeById(Long EmployeeID) {
        Optional<Employee> employeeList = employeeRepository.findById(EmployeeID);
        return employeeList.get();
    }

    public Employee getCurrentEmployee() {
        String email = (String)
                SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return  employeeRepository.findByEmail(email);
    }

}
