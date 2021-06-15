package com.friday.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/management")
public class ManagementController {

    @GetMapping("/user")
    public String createUser(){

        return "/management/user";
    }

    @GetMapping("/company")
    public String createCompany(){

        return"/management/company";
    }

    @GetMapping("/vendorClient")
    public String createvendorClient(){
        return "/management/vendorClient";
    }
}
