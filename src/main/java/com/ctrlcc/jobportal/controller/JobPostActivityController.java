package com.ctrlcc.jobportal.controller;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.ctrlcc.jobportal.services.UsersService;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class JobPostActivityController {
    
    private final UsersService usersService;

    public JobPostActivityController(UsersService usersService)   {
        this.usersService = usersService;
    }

    @GetMapping("/dashboard")
    public String searchJobs(Model model)   {
        Object currentUserProfile = usersService.getCurrentUserProfile();
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(!(authentication instanceof AnonymousAuthenticationToken))   {
            String currentUsername = authentication.getName();
            model.addAttribute("username",currentUsername);
        }
        model.addAttribute("user", currentUserProfile);
        return "dashboard";
    }
}