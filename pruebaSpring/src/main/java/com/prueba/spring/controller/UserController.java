package com.prueba.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.prueba.spring.DAO.UserDAO;
import com.prueba.spring.entidades.User;

@Controller
public class UserController {
	
	@Autowired
	private UserDAO userDAO;
	
	@RequestMapping(value="/user", method=RequestMethod.POST)
	public ModelAndView registrarUser(@ModelAttribute("user") User user) {
		
		if(user.getMail()!=)
		
		
		
	}
	
	
	
	

}
