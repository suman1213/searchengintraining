package com.search.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.search.model.User;
import com.search.service.TrainingSearch;

@Controller
public class SearchController {

	@Autowired
	private TrainingSearch trainingSearch;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String login() {
		return "index.html";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView loginView(@RequestParam("username") String username, @RequestParam("password") String password,
			HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		User user = trainingSearch.isValidLogin(username, password);
		ModelAndView mav = null;
		if(!(ObjectUtils.isEmpty(user))){
		if (user.getUsername() != null && !user.getUsername().equals("")) {
			session.setAttribute("user", user);
			mav = new ModelAndView("redirect:/intro");
		  }
		} else {
			mav = new ModelAndView("redirect:/");
		}
		return mav;
	}

	

	@RequestMapping(value = "intro")
	public String home() {
		System.out.println("home ");
		return "explainPage.html";
	}

	@RequestMapping(value = "logout")
	public ModelAndView logout(HttpSession session) {
		session.removeAttribute("user");
		session.invalidate();
		return new ModelAndView("redirect:/");
	}
}
