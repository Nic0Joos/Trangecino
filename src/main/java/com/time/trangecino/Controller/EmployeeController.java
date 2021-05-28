package com.time.trangecino.Controller;

import com.time.trangecino.business.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//written by Luca Weisskopf
@Controller
@RequestMapping(path = "/Employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public String getEmployeeView(){
        return "EmployeePanel.html";
    }

}

