package com.example.terencepan.springsamples.springmongorest.repositories;

import com.example.terencepan.springsamples.springmongorest.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<Person, String > {
    //Optional<Person> findById(String id);
    Optional<Person> findByEmail(String email);

}
