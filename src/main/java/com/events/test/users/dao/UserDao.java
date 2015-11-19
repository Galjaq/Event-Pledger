package com.events.test.users.dao;

import com.events.test.users.entity.User;

public interface UserDao {

	User findByUserName(String username);

}