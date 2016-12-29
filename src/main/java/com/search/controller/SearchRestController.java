package com.search.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.search.model.InputSearch;
import com.search.model.User;
import com.search.service.TrainingSearch;

@RestController
public class SearchRestController{

	@Autowired
	private TrainingSearch trainingSearch;
	

	@RequestMapping(value ="/getData", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<String>getData(@RequestParam String id){
		List<String> al = new ArrayList<String>();
		InputSearch input = trainingSearch.getInputSearch(id);
		if(!ObjectUtils.isEmpty(input)){
		al.add(input.getInputname());
		al.add(input.getInputdetails());
		}
		return al;
	}
}
