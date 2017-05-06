package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.entity.User;

@Controller
public class InitialController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute User user) {
		ModelAndView view=new ModelAndView();
		view.setViewName("user");
		view.addObject("user",user);
		return view;
	}
}
