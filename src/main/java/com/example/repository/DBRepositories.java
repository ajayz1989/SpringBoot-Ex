package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.User; 

public interface DBRepositories extends CrudRepository<User, String> {

}
