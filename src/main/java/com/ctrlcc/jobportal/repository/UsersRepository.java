package com.ctrlcc.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ctrlcc.jobportal.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
