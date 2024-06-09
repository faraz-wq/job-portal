package com.ctrlcc.jobportal.services;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.ctrlcc.jobportal.entity.JobSeekerProfile;
import com.ctrlcc.jobportal.entity.RecruiterProfile;
import com.ctrlcc.jobportal.entity.Users;
import com.ctrlcc.jobportal.repository.JobSeekerProfileRepository;
import com.ctrlcc.jobportal.repository.RecruiterProfileRepository;
import com.ctrlcc.jobportal.repository.UsersRepository;

@Service
public class UsersService {

    private final UsersRepository usersRepository;
    private final JobSeekerProfileRepository jobSeekerProfileRepository;
    private final RecruiterProfileRepository recruiterProfileRepository;

    public UsersService(UsersRepository usersRepository, JobSeekerProfileRepository jobSeekerProfileRepository, RecruiterProfileRepository recruiterProfileRepository) {
        this.usersRepository = usersRepository;
        this.jobSeekerProfileRepository = jobSeekerProfileRepository;
        this.recruiterProfileRepository = recruiterProfileRepository;
    }

    public Users addNew(Users users) {
        users.setActive(true);
        users.setRegistrationDate(new Date(System.currentTimeMillis()));
        Users savedUser = usersRepository.save(users);
        int userTypeId = users.getUserTypeId().getUserTypeId();

        if (userTypeId == 1) {
            recruiterProfileRepository.save(new RecruiterProfile(savedUser));
        }
        else {
            jobSeekerProfileRepository.save(new JobSeekerProfile(savedUser));
        }

        return savedUser;
    }
}
