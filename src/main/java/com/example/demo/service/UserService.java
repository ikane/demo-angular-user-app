package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
    private UserRepository repository;


	public List<User> findAll() {
		return repository.findAll();
	}

	public User findOneById(int id) {
		return repository.findOne(id);
	}
	
	public User create(User user) {
        return repository.save(user);
    }
	
	public User delete(int id) {
        User user = findOneById(id);
        if(user != null){
            repository.delete(user);
        }
        return user;
    }
	
	public User update(User user) {
        return null;
    }
}
