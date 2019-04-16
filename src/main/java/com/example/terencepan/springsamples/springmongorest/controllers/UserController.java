package com.example.terencepan.springsamples.springmongorest.controllers;

import com.example.terencepan.springsamples.springmongorest.model.Person;
import com.example.terencepan.springsamples.springmongorest.repositories.UserRepository;
import com.example.terencepan.springsamples.springmongorest.utils.SampleUtils;
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
        String sampleInitialPassword = SampleUtils.randomString(7);
        System.out.println(sampleInitialPassword);
        user.setEncryptedPassword(SampleUtils.encryptString(sampleInitialPassword));
        user.setIsUserActivated(false);
        userRepository.save(user);

        return "success";
    }
}
