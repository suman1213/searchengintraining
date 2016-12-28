package com.search.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.search.dao.TrainingSearchDao;
import com.search.model.User;

@Service
public class TrainingSearchImpl implements TrainingSearch{

	@Autowired
	TrainingSearchDao trainingSearchDao;
	
	@Override
	public User isValidLogin(String userName, String password) {
		User user = trainingSearchDao.isValidLogin(userName, password);
		if(user!= null){
			return user;	
		}
		return null;
	}

}
