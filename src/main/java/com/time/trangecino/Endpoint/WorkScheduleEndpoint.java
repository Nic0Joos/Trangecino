package com.time.trangecino.Endpoint;

import com.time.trangecino.Data.Domain.Employee;
import com.time.trangecino.Data.Domain.WorkSchedule;
import com.time.trangecino.business.service.EmployeeService;
import com.time.trangecino.business.service.WorkScheduleService;
import com.time.trangecino.Data.Domain.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//written by Kaan

/*
@RestController
@RequestMapping(path= "/WorkSchedule")
public class WorkScheduleEndpoint {

    private WorkScheduleService workscheduleservice;

    @Autowired
    public WorkScheduleEndpoint(WorkScheduleService workscheduleservice) { this.workscheduleservice = workscheduleservice;}
}


//add a workscheduleplan, POST
    /*@PostMapping(path = "/create")
@PostMapping(path = "/create")
public ResponseEntity<Void> createWorkschedule(@RequestBody WorkSchedule workschedule) {
    try {
        workscheduleservice.createWorkschedule(WorkSchedule);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    } catch (Exception e) {
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}*/