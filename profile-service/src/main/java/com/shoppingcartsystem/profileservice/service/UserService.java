package com.shoppingcartsystem.profileservice.service;

import java.util.List;
import java.util.Optional;



//import java.util.Optional;

import com.shoppingcartsystem.profileservice.model.User;

public interface UserService {
	

List<User> getAllUser();
	
	
	User addNewUser(User user);

	User getByFullName(String fullName);

	User updateProfile(User user);

	
	Optional<User> getById(String _id);


	User getByEmail(String email);

	
	
	
	

	/*
	 * List<User> getAllUser();
	 * 
	 * Optional<User> getUserById(String _id);
	 * 
	 * User getUserByName(String fullName);
	 * 
	 * User saveUser(User user);
	 */

	
	

	
	

}
