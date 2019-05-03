package com.example.terencepan.springsamples.springmongorest.services;

import com.example.terencepan.springsamples.springmongorest.model.Person;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    Person findByEmail(String email);

    //Person save(UserRegistrationDto registration);
}
