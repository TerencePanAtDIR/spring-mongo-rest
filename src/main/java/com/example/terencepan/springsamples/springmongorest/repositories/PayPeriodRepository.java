package com.example.terencepan.springsamples.springmongorest.repositories;

import com.example.terencepan.springsamples.springmongorest.model.PayPeriod;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PayPeriodRepository extends MongoRepository<PayPeriod, String > {
    PayPeriod findByMonthAndYear(String month, String year);
}
