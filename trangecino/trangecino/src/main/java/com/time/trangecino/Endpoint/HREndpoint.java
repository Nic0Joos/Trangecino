package com.time.trangecino.Endpoint;

import com.time.trangecino.business.service.EmployeeService;
import com.time.trangecino.business.service.HRService;
import org.springframework.beans.factory.annotation.Autowired;
//Written by Alex
public class HREndpoint {

    private HREndpoint HREndpoint;

    @Autowired
    public HREndpoint(HREndpoint HREndpoint) {
        this.HREndpoint = HREndpoint;
    }

}
