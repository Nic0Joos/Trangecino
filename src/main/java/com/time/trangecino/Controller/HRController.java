package com.time.trangecino.Controller;

import com.time.trangecino.Data.Domain.HR;
import com.time.trangecino.business.service.EmployeeService;
import com.time.trangecino.business.service.HRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path = "/HR")
public class HRController {

    @Autowired
    private HRService hrService;

    @GetMapping
    public String getLoginView() {
        return "HRPanel.html";
    }
}
