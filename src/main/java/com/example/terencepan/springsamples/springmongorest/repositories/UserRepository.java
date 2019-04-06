package com.example.terencepan.springsamples.springmongorest.repositories;

import com.example.terencepan.springsamples.springmongorest.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Person, String > {

}
