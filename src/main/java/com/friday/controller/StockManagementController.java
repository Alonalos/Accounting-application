package com.friday.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/stockManagement")
public class StockManagementController {

    @GetMapping("/product")
    public String products(){
        return "/stockManagement/product";

    }
}
