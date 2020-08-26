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
import com.prueba.spring.entidades.UserLogin;

@Controller
public class LoginController {
	
	@Autowired
	private UserDAO userDAO;
	
	@RequestMapping(value="/userLogin", method=RequestMethod.GET)
	public ModelAndView userLogin(HttpServletRequest req, HttpServletResponse res) {
		
		ModelAndView mav = new ModelAndView("userLogin");
		mav.addObject("userLogin", new UserLogin());
		return mav;
		
	}
	
	@RequestMapping(value="/inicio", method=RequestMethod.POST)
	public ModelAndView userInicio(@ModelAttribute("userLogin") UserLogin userLogin, HttpServletRequest req, HttpServletResponse res) {
		
		ModelAndView mav = null;
		
		User user = userDAO.loginUser(userLogin);
		
		if(user != null) {
			mav = new ModelAndView("bienvenido");
			mav.addObject("nombre",user.getNombre());
		}else {
			mav = new ModelAndView("userLogin");
			mav.addObject("message","Mail o Contraseña Incorrecta");			
		}
		
		return mav;
		
	}
	

}
