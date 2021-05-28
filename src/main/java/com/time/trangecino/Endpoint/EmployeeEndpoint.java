package com.time.trangecino.Endpoint;

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
@RequestMapping(path= "/api")
public class EmployeeEndpoint {
    @Autowired
    EmployeeService employeeService;

    //add employee - Endpoint
    @PostMapping(path = "/Employee", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Void> postEmployee(@RequestBody Employee employee) {
        try {
            employeeService.addEmployee(employee);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    //edit employee - Endpoint
    @PutMapping(path = "/Employee/{EmployeeID}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Void> editEmployee(@RequestBody Employee employee){
        try {
            employeeService.editEmployee(employee);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage());
        }
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    //delete employee - Endpoint
    @DeleteMapping(path = "/Employee/{EmployeeID}")
    public ResponseEntity<Void> deleteEmployee(Employee employee){
        try {
            employeeService.deleteEmployee(employee.getEmployeeID());
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage());
        }
        return ResponseEntity.accepted().build();
    }

    //get all employees - Endpoint
    @GetMapping(path = "/Employee", produces = "application/json")
    public List<Employee> getEmployee() {
        return employeeService.findAllEmployees();
    }

    //get one specific employee - Endpoint
    @GetMapping(path = "/Employee/{EmployeeID}", produces = "application/json")
    public ResponseEntity<Employee> getEmployee(@PathVariable(value = "EmployeeId") String EmployeeID) {
        Employee employee = null;
        try {
            employee = employeeService.findEmployeeById(Long.parseLong(EmployeeID));
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
        return ResponseEntity.ok(employee);
    }

}

