package com.time.trangecino.business.service;

import com.time.trangecino.Data.Domain.Employee;
import com.time.trangecino.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import javax.validation.Valid;
import java.util.List;

//Written by Luca Weisskopf
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    //add and save employee
    public void addEmployee(@Valid Employee employee) throws Exception {
        if (employee.getID() == null) {
            if (employeeRepository.findByEmail(employee.getEmail()) != null) {
                throw new Exception("Please enter a new email address");
            }
        }
        employee.setPassword(passwordEncoder.encode(employee.getPassword()));
        employeeRepository.save(employee);
    }

    //edit employee
    public Employee editEmployee(@Valid Employee employee) throws Exception {
        if (employee.getID() == null) {
            throw new Exception("No employee found");
        } else {
            return employeeRepository.save(employee);
        }
    }

    //delete employee
    public void deleteEmployee (Long employeeID){
            employeeRepository.deleteById(employeeID);
        }


    //find all employees
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    //find one specific employee
    public Employee findEmployeeById(long employeeID) throws Exception {
        List<Employee> employeeList = employeeRepository.findbyID(employeeID);
        if (employeeList.isEmpty()){
            throw new Exception("No admin with ID "+employeeID+" found.");
        }
        return employeeList.get(0);
    }
}
