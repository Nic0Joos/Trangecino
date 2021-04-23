package com.time.trangecino.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//written by Luca

@RestController
@RequestMapping(path= "/employee")
public class EmployeeEndpoint {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeEndpoint(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/clockTime")
    public String ClockTime(){
        return //weissi nonig - nico fragen
    }
}
