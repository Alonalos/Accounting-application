package com.friday.controller;

import com.friday.dto.CompanyDTO;
import com.friday.dto.RoleDTO;
import com.friday.dto.UserDTO;
import com.friday.implementation.RoleServiceImpl;
import com.friday.service.CompanyService;
import com.friday.service.RoleService;
import com.friday.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/management")
public class ManagementController {

    @Autowired
    RoleService roleService;
    @Autowired
    UserService userService;

    @Autowired
    CompanyService companyService;


    @GetMapping("/user")
    public String createUser(Model model){
        model.addAttribute("user", new UserDTO());
        model.addAttribute("roles",roleService.listAllRoles());
        model.addAttribute("users",userService.listAllUsers());
        model.addAttribute("companies",companyService.listAllCompanies());
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
        model.addAttribute("companies",companyService.listAllCompanies());
        return"/management/company";
    }

    @PostMapping("/company")
    public String insertCompany( CompanyDTO company, Model model) throws Exception {
        companyService.save(company);
        return"redirect:/management/company";
    }


    @GetMapping("/vendorClient")
    public String createvendorClient(){
        return "/management/vendorClient";
    }





}
