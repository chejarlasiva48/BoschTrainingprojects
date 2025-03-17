package com.app.book_store.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.book_store.entities.UsersEntity;
import com.app.book_store.models.CustomException;
import com.app.book_store.models.UserRequest;
import com.app.book_store.repository.UsersRepository;

@Service
public class UsersService {
	@Autowired
	private UsersRepository usersRepository;

	public UsersEntity createUser(UserRequest userRequest) {
		UsersEntity user = new UsersEntity();
		user.setPassword(userRequest.getPassword());
		user.setUsername(userRequest.getUsername());
		return usersRepository.save(user);
	}

	public UsersEntity loginUser(String username, String password) throws CustomException {
		Optional<UsersEntity> user = usersRepository.findByUsername(username);
		if (!user.isEmpty()) {
			UsersEntity userEntity = user.get();
			if (userEntity.getPassword().equals(password)) {
				return userEntity;
			} else {
				throw new CustomException("Exception while loggin in", "Wrong credentials");
			}
		} else {
			throw new CustomException("Exception while loggin in", "User doesn't exist");
		}
	}
}
