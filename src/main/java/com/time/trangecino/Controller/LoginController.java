package com.time.trangecino.Controller;

import com.time.trangecino.Data.Domain.Employee;
import com.time.trangecino.business.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// Luca Weisskopf

@Controller
@RequestMapping (path= "/login")
public class LoginController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public String getLoginView() {
        return "Login.html";
    }
}
