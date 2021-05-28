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

    /* add and save employee
    if the email is not null than there is already a email with that input
    otherwise if the ID is null than save the employee */
    public void addEmployee(@Valid Employee employee) throws Exception {
        if (employee.getEmployeeID() == null) {
            if (employeeRepository.findByEmail(employee.getEmail()) != null) {
                throw new Exception("Email address is already assigned");
            }
        }
        employee.setPassword(passwordEncoder.encode(employee.getPassword()));
        employeeRepository.save(employee);
    }

    /* edit employee
    if the ID is null than no employee was found
    otherwise save the employee (with the edited data) */
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

    //find one specific employee (using the EmployeeID)
    public Employee findEmployeeById(Long EmployeeID) {
        Optional<Employee> employeeList = employeeRepository.findById(EmployeeID);
        return employeeList.get();
    }

    //used in "WorkScheduleService" to get all workschedules from the logged-in employee
    public Employee getCurrentEmployee() {
        String email = (String)
                SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return  employeeRepository.findByEmail(email);
    }

}
