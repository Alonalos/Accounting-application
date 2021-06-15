package com.friday.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/invoices")
public class InvoicesController {

    @GetMapping("/purchaseInvoice")
    public String purchaseInvoice(){
        return "/invoices/purchaseInv";
    }
}
