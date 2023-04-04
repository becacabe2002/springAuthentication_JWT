package com.nmintu.spring_jwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nmintu.spring_jwt.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User> findUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email)''
}

