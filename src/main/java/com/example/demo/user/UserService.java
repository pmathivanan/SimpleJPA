package com.example.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	private UserRepository repository;

	@Autowired
	public UserService(UserRepository repository) {
		this.repository = repository;
	}

	public List<UserBean> getAll() {
		return repository.findAll();
	}

	public UserBean save(UserBean object) {
		return this.repository.save(object);
	}
}
