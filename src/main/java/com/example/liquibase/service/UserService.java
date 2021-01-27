package com.example.liquibase.service;

import com.example.liquibase.entity.User;
import com.example.liquibase.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}
