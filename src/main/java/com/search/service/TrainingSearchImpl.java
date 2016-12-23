package com.search.service;

import org.springframework.stereotype.Service;

@Service
public class TrainingSearchImpl implements TrainingSearch{

	@Override
	public boolean isValidLogin(String userName, String password) {
		//int  loginCount = loginRepository.getLoginVerified(userName, password);
		//if(loginCount == 1){
			//return true;	
		//}
		return false;
	}

}
