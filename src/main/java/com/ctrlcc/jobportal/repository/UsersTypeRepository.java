package com.ctrlcc.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ctrlcc.jobportal.entity.UsersType;

public interface UsersTypeRepository extends JpaRepository<UsersType, Integer>{
    
}