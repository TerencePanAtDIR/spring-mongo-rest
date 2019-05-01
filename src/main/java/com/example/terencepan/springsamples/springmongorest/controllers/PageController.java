package com.example.terencepan.springsamples.springmongorest.controllers;

import com.example.terencepan.springsamples.springmongorest.model.Person;
import com.example.terencepan.springsamples.springmongorest.repositories.UserRepository;
import com.example.terencepan.springsamples.springmongorest.utils.SampleUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class PageController {

    @Autowired
    private UserRepository userRepository;

    public String gotoNewTimesheet(Model model){
        return "NewTimesheet";
    }
    //login page

    //manage timesheets

    //supervisor screen
    @RequestMapping("/CreateUser")
    public String createUserPage(Model model) {
        model.addAttribute("person", new Person());
        model.addAttribute("created","N");
        return "CreateUser";
    }

    @RequestMapping("/CreateEditTimesheet")
    public String createEditTimesheet(Model model) {

        return "NewTimesheet";
    }

    @PostMapping(path = "/insertEmployeePage")
    public String createUserPage(@ModelAttribute("user") Person user,
                                 Model model){
        model.addAttribute("createdIndicator", "Y");
        String sampleInitialPassword = SampleUtils.randomString(7);
        System.out.println(sampleInitialPassword);
        user.setEncryptedPassword(SampleUtils.encryptString(sampleInitialPassword));
        user.setIsUserActivated(false);
        userRepository.save(user);

        return "CreateUser";
    }
    //UpdateNewUserPassword

    @RequestMapping("/UpdateNewUserPassword")
    public String updateNewUserPassword(@ModelAttribute("user") Person user,
                                        Model model){

        Optional<Person> foundUser = userRepository.findByEmail(user.getEmail());

        //User with Email is not found
        if(foundUser.isPresent() == false){
            model.addAttribute("Error", "User with email is not found");
            return "UserNotFound";
        }

        String userEncryptedPassword = foundUser.get().getEncryptedPassword();

        String userCurrentPassword = SampleUtils.decryptString(userEncryptedPassword);

        //Get current password from Update New User Password form
        String formCurrentPassword = user.getEncryptedPassword();

        //Current password does not match
        if(!userCurrentPassword.equals(formCurrentPassword)){
            //Show msg that current password does not match
            model.addAttribute("Error", "Current Password does not match");
            return "UpdateNewUserPassword";
        }

        //New Password does not match confirmed password
        if(!user.getEncryptedPassword().equals(user.getConfirmPassword())){
            //Show msg that New Password does not match confirmed password
            model.addAttribute("Error", "New Password does not match confirmed password");
            return "UpdateNewUserPassword";
        } else {
            Person foundUserPerson = foundUser.get();
            foundUserPerson.setEncryptedPassword(SampleUtils.encryptString(formCurrentPassword));
            userRepository.save(foundUserPerson);
        }

        return "ManageBillCodes";
    }

}
