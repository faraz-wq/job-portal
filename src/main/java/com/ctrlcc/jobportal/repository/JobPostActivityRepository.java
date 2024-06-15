package com.ctrlcc.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ctrlcc.jobportal.entity.JobPostActivity;

public interface JobPostActivityRepository extends JpaRepository<JobPostActivity, Integer> {
}