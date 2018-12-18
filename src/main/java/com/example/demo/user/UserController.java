package com.example.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	private UserService service;

	@Autowired
	public UserController(UserService service) {
		this.service = service;
	}

	@RequestMapping(path = "/getName")
	public String getName() {
		return "Mathivanan";
	}

	@RequestMapping(path = "/getAllUsers")
	public ResponseEntity<List<UserBean>> getAllUsers() {
		return ResponseEntity.ok(this.service.getAll());
	}

	@PostMapping
	@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, path = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserBean> save(@RequestBody UserBean object) {
		return ResponseEntity.ok(this.service.save(object));
	}

}
