package com.bosch.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosch.model.User;
import com.bosch.repository.UserRepository;
import com.bosch.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public User signupUser(User user) {
        return userRepository.save(user);
    }

    public User loginUser(String username) {
        return userRepository.findByUsername(username);
    }
}