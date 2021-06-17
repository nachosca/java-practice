package com.nacho.services;

import java.util.List;

import com.nacho.entities.User;

public interface UserManagementService {

	String registerUser(User user);
	
	List<User> getUsers();

	User getUserByEmail(String userEmail);

}
