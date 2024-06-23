package com.blogs.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blogs.custom_exception.AuthenticationException;
import com.blogs.dao.UserDao;
import com.blogs.entities.User;

@Service
@Transactional
public class UserServiceImpl  implements UserService{

	 @Autowired
	 private UserDao dao;
	@Override
	public User loginUser(String email, String password) {

		Optional<User> optional=
			dao.findByEmailAndPassword(email, password);
		return optional.orElseThrow(()->
		new AuthenticationException("Invalid email or password")
				);
		
	}

}
