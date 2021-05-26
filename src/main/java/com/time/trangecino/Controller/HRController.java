package com.time.trangecino.Controller;


import com.time.trangecino.business.service.HRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


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
