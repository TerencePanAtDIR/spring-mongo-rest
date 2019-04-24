package com.example.terencepan.springsamples.springmongorest.controllers;

import com.example.terencepan.springsamples.springmongorest.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    public String gotoNewTimesheet(Model model){
        return "NewTimesheet";
    }
    //login page

    //manage timesheets

    //supervisor screen
    @RequestMapping("/CreateUser")
    public String createUserPage(Model model) {
        model.addAttribute("person", new Person());

        return "CreateUser";
    }
    @RequestMapping("/CreateEditTimesheet")
    public String createEditTimesheet(Model model) {

        return "CreateUser";
    }
}
