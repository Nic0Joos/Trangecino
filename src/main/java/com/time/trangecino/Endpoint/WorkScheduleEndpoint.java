package com.time.trangecino.Endpoint;

import com.time.trangecino.business.service.EmployeeService;
import com.time.trangecino.business.service.WorkScheduleService;
import com.time.trangecino.Data.Domain.Admin;
import org.springframework.beans.factory.annotation.Autowired;
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


//add a workscheduleplan
    /*@PostMapping(path = "/create")*/