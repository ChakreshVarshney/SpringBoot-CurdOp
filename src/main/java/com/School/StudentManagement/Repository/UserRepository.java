package com.School.StudentManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.School.StudentManagement.DTO.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
