package com.search.dao;

import com.search.model.User;

public interface TrainingSearchDao {
	public User getByUnamePass(String userName, String password);
}
