package com.time.trangecino.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//written by Lennart
@Controller
@RequestMapping(path = "/Admin")
public class AdminController {


    @GetMapping
    public String getAdminView(){
        return "AdminPanel.html";
    }

}

