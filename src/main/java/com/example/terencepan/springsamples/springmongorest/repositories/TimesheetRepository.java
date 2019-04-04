package com.example.terencepan.springsamples.springmongorest.repositories;

import com.example.terencepan.springsamples.springmongorest.model.Timesheet;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TimesheetRepository extends MongoRepository<Timesheet, String > {

}
