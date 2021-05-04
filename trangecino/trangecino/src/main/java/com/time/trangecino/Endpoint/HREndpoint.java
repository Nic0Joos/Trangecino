package com.time.trangecino.Endpoint;

import com.time.trangecino.Data.Domain.Employee;
import com.time.trangecino.Data.Domain.HR;
import com.time.trangecino.business.service.EmployeeService;
import com.time.trangecino.business.service.HRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//Written by Alex

@RestController
@RequestMapping(path= "/HR")
public class HREndpoint {

    private HREndpoint hrEndpoint;

    @Autowired
    public HREndpoint(HREndpoint hrEndpoint) {
        this.hrEndpoint = hrEndpoint;
    }

    //@PutMapping
    //Assign project from service

}
