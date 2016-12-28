package com.search.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.search.model.User;

public interface TrainingSearchDao extends CrudRepository<User, Serializable>{
	@Query("SELECT usr FROM User usr where  username= :username and password= :password ")
	public User isValidLogin(@Param("username")final String userName,@Param("password")final String password);
}
