package com.search.service;

import com.search.model.InputSearch;
import com.search.model.User;

public interface TrainingSearch {
	public User isValidLogin(String userName, String password);
	public InputSearch getInputSearch(String userinput);
}
