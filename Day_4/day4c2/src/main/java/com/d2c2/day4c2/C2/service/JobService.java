package com.d2c2.day4c2.C2.service;

import com.d2c2.day4c2.C2.repository.*;
import com.d2c2.day4c2.C2.model.*;
import org.springframework.stereotype.Service;

@Service
public class JobService {

    private final JobRepo jobRepo;

    public JobService(JobRepo jobRepo) {
        this.jobRepo = jobRepo;
    }

    public Job addJob(Job job) {
        return jobRepo.save(job);
    }

    public Job getJobById(int jobId) {
        return jobRepo.findById(jobId).orElse(null);
    }

    public Iterable<Job> getAllJobs() {
        return jobRepo.findAll();
    }
}

