package com.example.terencepan.springsamples.springmongorest.services;

import com.example.terencepan.springsamples.springmongorest.dtos.UserRegistrationDto;
import com.example.terencepan.springsamples.springmongorest.model.Person;
import com.example.terencepan.springsamples.springmongorest.repositories.UserRepository;
import com.example.terencepan.springsamples.springmongorest.utils.SampleUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public Person findByEmail(String email){
        return userRepository.findByEmail(email).get();
    }

    public Person save(UserRegistrationDto registration) {
        Person user = new Person();
        user.setFirstName(registration.getFirstName());
        user.setLastName(registration.getLastName());
        user.setEmail(registration.getEmail());
        user.setEncryptedPassword(SampleUtils.encryptString(registration.getPassword()));
        user.setUserRoles(Arrays.asList("ROLE_USER"));
        return userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Optional<Person> optionalPerson = userRepository.findByEmail(email);

        Person user;

        if (!optionalPerson.isPresent()) {
            throw new UsernameNotFoundException("Invalid username or password.");
        } else {
            user = optionalPerson.get();
        }

        return new org.springframework.security.core.userdetails.User(
                user.getEmail(),
                user.getEncryptedPassword(),
                mapRolesToAuthorities(user.getUserRoles()));

    }

    private Collection < ? extends GrantedAuthority > mapRolesToAuthorities(Collection <String> roles) {
        return roles.stream()
                .map(role -> new SimpleGrantedAuthority(role))
                .collect(Collectors.toList());
    }
}
