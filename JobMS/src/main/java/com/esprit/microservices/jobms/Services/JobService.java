package com.esprit.microservices.jobms.Services;

import com.esprit.microservices.jobms.Entities.Job;
import com.esprit.microservices.jobms.Repositories.JobRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository ;


    public Job updateJobEtat(int id) {
        if (jobRepository.findById(id).isPresent() ) {
            Job existingJob = jobRepository.findById(id).get();
            existingJob.setEtat(true);
            return jobRepository.save(existingJob);
        }else
            return null;
    }

}