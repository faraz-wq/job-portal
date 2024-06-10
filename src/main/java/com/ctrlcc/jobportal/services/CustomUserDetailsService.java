package com.ctrlcc.jobportal.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ctrlcc.jobportal.entity.Users;
import com.ctrlcc.jobportal.repository.UsersRepository;
import com.ctrlcc.jobportal.util.CustomUserDetails;

@Service
public class CustomUserDetailsService implements UserDetailsService{
    
    private final UsersRepository usersRepository;

    public CustomUserDetailsService(UsersRepository usersRepository)    {
        this.usersRepository = usersRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = usersRepository.findByEmail(username).orElseThrow(()->  new
            UsernameNotFoundException("Could not find user."));
        return new CustomUserDetails(user);
    }
}