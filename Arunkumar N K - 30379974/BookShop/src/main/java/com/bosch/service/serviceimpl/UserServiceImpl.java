package com.bosch.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosch.model.User;
import com.bosch.repository.UserRepository;
import com.bosch.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
    
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public User login(String username, String pass) {
        return userRepository.findByUsernameAndPassword(username, pass);
    }

	
}