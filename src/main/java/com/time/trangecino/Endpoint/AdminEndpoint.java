package com.time.trangecino.Endpoint;

import com.time.trangecino.business.service.AdminService;
import com.time.trangecino.Data.Domain.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//written by Lennart

@RestController
@RequestMapping(path= "/Admin")
public class AdminEndpoint {

    private AdminEndpoint adminEndpoint;

    @Autowired
    public AdminEndpoint(AdminEndpoint adminEndpoint) {
        this.adminEndpoint = adminEndpoint;
    }



}
