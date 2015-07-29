package com.events.test.users.dao;

import com.events.test.users.model.User;

public interface UserDao {

	User findByUserName(String username);

}