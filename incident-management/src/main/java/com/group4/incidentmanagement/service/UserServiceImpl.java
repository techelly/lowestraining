package com.group4.incidentmanagement.service;

import com.group4.incidentmanagement.dao.UserRepository;
import com.group4.incidentmanagement.entities.User;
import com.group4.incidentmanagement.exceptions.NotAbleToSaveUserException;
import com.group4.incidentmanagement.exceptions.UserNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public User createUser(User user) throws NotAbleToSaveUserException {
		User usr = userRepo.save(user);
		if (usr != null) {
			return usr;
		} else {
			throw new NotAbleToSaveUserException();
		}
	}

	@Override
	public User retrieveUser(Integer userId) throws UserNotFoundException {
		Optional<User> user = userRepo.findById(userId);
		if (user.isPresent())
			return user.get();
		else
			throw new UserNotFoundException("User with userId ---" + userId + " doesn't exists");
	}

	@Override
	public User updateUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public void deleteUser(Integer userId) {
		userRepo.deleteById(userId);
	}
}
