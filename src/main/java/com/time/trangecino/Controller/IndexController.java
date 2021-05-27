package com.time.trangecino.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//written by Luca Weisskopf
@Controller
@RequestMapping(path = "/")

public class IndexController {

    @GetMapping
    public String getIndexView(){
        return "Index.html";
    }
}
