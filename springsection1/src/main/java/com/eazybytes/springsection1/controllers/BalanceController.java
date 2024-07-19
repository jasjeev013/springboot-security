package com.eazybytes.springsection1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    @GetMapping("/myBalance")
    public String getbalanceDetails(){
        return "Here are Balance Details from DB";
    }
}
