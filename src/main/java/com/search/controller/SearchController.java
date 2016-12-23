package com.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.search.service.TrainingSearch;

@Controller
public class SearchController {
	
	@Autowired
	private TrainingSearch trainingSearch;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String login(){
		return "index.html";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String loginView(@RequestParam("username") String username,@RequestParam("password") String password) {
		boolean loginValidRes =  trainingSearch.isValidLogin(username, password);
		if(loginValidRes){
			return "Home";
		}else{
			return "login";
		}
		
	}
	@RequestMapping(value="/login/redirect", method=RequestMethod.GET)
	public String redirect(){
		return "login";
	}
}
