package com.time.trangecino.Endpoint;

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

    private HREndpoint HREndpoint;

    @Autowired
    public HREndpoint(HREndpoint HREndpoint) {
        this.HREndpoint = HREndpoint;
    }

    //@PutMapping
    //Assign project from service

}
