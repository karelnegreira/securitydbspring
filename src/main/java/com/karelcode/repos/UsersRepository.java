package com.karelcode.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karelcode.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{
Users findByUsername(String username);
}
