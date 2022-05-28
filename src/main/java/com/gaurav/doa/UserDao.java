package com.gaurav.doa;

import java.util.List;

import com.gaurav.model.User;

public interface UserDao {

	void saveUser(User user);

	User getUserById(long id);

	List<User> getAllUsers();

	void updateUser(User user);

	void deleteUserById(long id);

}