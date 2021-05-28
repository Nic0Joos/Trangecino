package com.time.trangecino.Controller;

import com.time.trangecino.business.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//written by Lennart
@Controller
@RequestMapping(path = "/Admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    @GetMapping
    public String getAdminView(){
        return "AdminPanel.html";
    }

}

