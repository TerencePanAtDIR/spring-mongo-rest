package com.example.terencepan.springsamples.springmongorest.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {
    public String gotoNewTimesheet(Model model){
        return "NewTimesheet";
    }
    //login page

    //manage timesheets

    //supervisor screen
    @RequestMapping("/CreateUser")
    public String createUserPage() {
        return "CreateUser";
    }
}
