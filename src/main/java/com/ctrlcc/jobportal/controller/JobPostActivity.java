package com.ctrlcc.jobportal.controller;

import org.springframework.stereotype.Controller;

import com.ctrlcc.jobportal.services.UsersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class JobPostActivity {
    
    private final UsersService usersService;

    public JobPostActivity(UsersService usersService)   {
        this.usersService = usersService;
    }

    @GetMapping("/dashboard")
    public String searchJobs(Model model)   {
        Object currentUserProfile = usersService.getCurrentUserProfile();
    }
}