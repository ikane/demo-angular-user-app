package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;

//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class UserApi {

	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<User> findAll() {
		return userService.findAll();
	}
	
	@GetMapping(path="/{id}")
	public User findOne(@PathVariable("id") int id) {
		return userService.findOneById(id);
	}
	
	@PostMapping
    public User create(@RequestBody User user){
        return userService.create(user);
    }
	
	@PutMapping
    public User update(@RequestBody User user){
        return userService.update(user);
    }
	
	@DeleteMapping(path ={"/{id}"})
    public User delete(@PathVariable("id") int id) {
        return userService.delete(id);
    }
}
