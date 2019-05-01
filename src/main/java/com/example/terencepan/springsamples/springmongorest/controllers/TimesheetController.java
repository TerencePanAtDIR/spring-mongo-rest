package com.example.terencepan.springsamples.springmongorest.controllers;

import com.example.terencepan.springsamples.springmongorest.model.Timesheet;
import com.example.terencepan.springsamples.springmongorest.repositories.TimesheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimesheetController {
    @Autowired
    private TimesheetRepository timesheetRepository;



    @PostMapping(path = "/insertTimsheet")
    public ResponseEntity<Timesheet> createTimesheet(@ModelAttribute("timesheet") Timesheet timesheet) {
        timesheetRepository.save(timesheet);

        return new ResponseEntity<>(timesheet, HttpStatus.ACCEPTED);
    }
}
