package com.friday.controller;

import com.friday.dto.CompanyDTO;
import com.friday.dto.RoleDTO;
import com.friday.dto.UserDTO;
import com.friday.implementation.RoleServiceImpl;
import com.friday.service.RoleService;
import com.friday.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/management")
public class ManagementController {

    @Autowired
    RoleService roleService;
    @Autowired
    UserService userService;


    @GetMapping("/user")
    public String createUser(Model model){
        model.addAttribute("user", new UserDTO());
        model.addAttribute("roles",roleService.listAllRoles());
        model.addAttribute("users",userService.listAllUsers());
        return "/management/user";
    }

    @PostMapping("/user")
    public String insertUser(UserDTO user,Model model){

        userService.save(user);
        return "redirect:/management/user";
    }

    @GetMapping("/company")
    public String createCompany( Model model){
        model.addAttribute("company",new CompanyDTO());
        return"/management/company";
    }

    @GetMapping("/vendorClient")
    public String createvendorClient(){
        return "/management/vendorClient";
    }
}
