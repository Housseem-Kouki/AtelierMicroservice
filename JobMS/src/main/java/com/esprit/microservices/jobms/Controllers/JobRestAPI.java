package com.esprit.microservices.jobms.Controllers;

import com.esprit.microservices.jobms.Entities.Job;
import com.esprit.microservices.jobms.Services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api/jobs")
public class JobRestAPI {
    private String hello ="Hello , I am the Job Microservice";
    @Autowired
    private JobService jobService ;

    @RequestMapping("/hello")
    public String sayHello(){
        return hello;
    }

    @PutMapping(value ="/{id}" ,produces =MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Job> updateJobEtat (@PathVariable(value ="id") int id ){
        return new ResponseEntity<>(jobService.updateJobEtat(id),HttpStatus.OK);
    }
}
