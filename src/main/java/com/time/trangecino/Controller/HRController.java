package com.time.trangecino.Controller;


import com.time.trangecino.business.service.HRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


//@Controller
//@RequestMapping(path = "/HR")
public class HRController {

    @Autowired
    private HRService hrService;

    @GetMapping
    public String getLoginView() {
        return "HRPanel.html";
    }
}
