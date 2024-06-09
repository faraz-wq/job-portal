package com.ctrlcc.jobportal.repository;

import com.ctrlcc.jobportal.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Integer>{
    
}