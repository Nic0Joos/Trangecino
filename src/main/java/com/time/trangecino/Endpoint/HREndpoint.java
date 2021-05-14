package com.time.trangecino.Endpoint;

import com.time.trangecino.Data.Domain.Employee;
import com.time.trangecino.Data.Domain.HR;
import com.time.trangecino.business.service.EmployeeService;
import com.time.trangecino.business.service.HRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//Written by Alex

@RestController
@RequestMapping(path= "/hr")
public class HREndpoint {

    private HRService hrService;

    @Autowired
    public HREndpoint(HRService hrService) { this.hrService = hrService; }

    @PostMapping
    public void postHR(/*@RequestBody?*/ HR hr) {
        try {
            hrService.registerHR(hr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
