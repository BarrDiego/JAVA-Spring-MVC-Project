package com.prueba.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.prueba.spring.DAO.UserDAO;
import com.prueba.spring.entidades.User;

@Controller
public class UserRegisterController {
	
	@Autowired
	private UserDAO userDAO;
	
	@RequestMapping(value="/registrar", method=RequestMethod.GET)
	public ModelAndView registrarUser(HttpServletRequest req, HttpServletResponse res) {
		
		ModelAndView mav = new ModelAndView("registrar");
		mav.addObject("user", new User());
		
		return mav;
	}
	
	@RequestMapping(value="/bienvenido", method=RequestMethod.POST)
	public ModelAndView agregadoUser(@ModelAttribute("user") User user, HttpServletRequest req, HttpServletResponse res) {
		userDAO.registrarUser(user);
		return new ModelAndView("bienvenido", "nombre", user.getNombre());
		
		
	}
	
	

}
