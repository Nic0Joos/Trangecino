package com.time.trangecino.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//written by Alex
@Controller
@RequestMapping(path = "/HR")
public class HRController {


    @GetMapping
    public String getHRView(){
        return "HRPanel.html";
    }

}

