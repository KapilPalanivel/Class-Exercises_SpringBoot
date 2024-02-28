package com.d2c2.day4c2.C2.repository;


import org.springframework.data.repository.CrudRepository;

import com.d2c2.day4c2.C2.model.Job;

public interface JobRepo extends CrudRepository<Job, Integer> {
}
