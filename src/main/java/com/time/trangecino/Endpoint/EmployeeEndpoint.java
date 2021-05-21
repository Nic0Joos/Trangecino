package com.time.trangecino.Endpoint;

import com.time.trangecino.Data.Domain.Admin;
import com.time.trangecino.Data.Domain.Employee;
import com.time.trangecino.business.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

//written by Luca Weisskopf

@RestController
@RequestMapping(path= "/employee")
public class EmployeeEndpoint {
    private EmployeeService employeeService;
    private EmployeeEndpoint employeeEndpoint;
    @Autowired
    public EmployeeEndpoint(EmployeeEndpoint employeeEndpoint) {
        this.employeeEndpoint = employeeEndpoint;
    }


    //add employee - Endpoint
    @PostMapping(path = "/create")
    public ResponseEntity<Void> postEmployee(@RequestBody Employee employee) {
        try {
            employeeService.addEmployee(employee);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    //edit employee - Endpoint
    @PutMapping(path ="/edit")
    public ResponseEntity<Void> editEmployee(@RequestBody Employee employee){
        try {
            employeeService.editEmployee(employee);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage());
        }
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    //delete employee - Endpoint
    @DeleteMapping(path="/delete")
    public ResponseEntity<Void> deleteEmployee(Employee employee){
        try {
            employeeService.deleteEmployee(employee.getID());
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage());
        }
        return ResponseEntity.accepted().build();
    }

    //get all employee - Endpoint
    @GetMapping(path = "/employee", produces = "application/json")
    public List<Employee> getEmployee() {
        return employeeService.findAllEmployees();
    }

    //get specific employee - Endpoint
    @GetMapping(path = "/employee/{employeeId}", produces = "application/json")
    public ResponseEntity<Employee> getEmployee(@PathVariable(value = "employeeId") String employeeId) {
        Employee employee = null;
        try {
            employee = employeeService.findEmployeeById(Long.parseLong(employeeId));
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
        return ResponseEntity.ok(employee);
    }

    }

