package com.ctrlcc.jobportal.services;

import org.springframework.stereotype.Service;

import com.ctrlcc.jobportal.entity.JobPostActivity;
import com.ctrlcc.jobportal.repository.JobPostActivityRepository;

@Service
public class JobPostActivityService {

    private final JobPostActivityRepository jobPostActivityRepository;

    public JobPostActivityService(JobPostActivityRepository jobPostActivityRepository) {
        this.jobPostActivityRepository = jobPostActivityRepository;
    }

    public JobPostActivity addNew(JobPostActivity jobPostActivity) {
        return jobPostActivityRepository.save(jobPostActivity);
    }
    
}
