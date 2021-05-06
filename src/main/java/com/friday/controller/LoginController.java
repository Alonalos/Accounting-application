package com.friday.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class LoginController {

    @RequestMapping("/home")
    public String sayHello() {
        return "/stockManagement/product";
    }
}
