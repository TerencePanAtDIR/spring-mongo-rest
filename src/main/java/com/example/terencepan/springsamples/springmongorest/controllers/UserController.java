package com.example.terencepan.springsamples.springmongorest.controllers;

import com.example.terencepan.springsamples.springmongorest.model.Person;
import com.example.terencepan.springsamples.springmongorest.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping(path = "/upsertEmployee")
    public String createUser(@ModelAttribute("user") Person user){
        userRepository.save(user);

        return "success";
    }
}
