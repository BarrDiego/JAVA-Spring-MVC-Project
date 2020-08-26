package com.prueba.spring.DAO;

import com.prueba.spring.entidades.User;
import com.prueba.spring.entidades.UserLogin;


public interface UserDAO {

	public void registrarUser(User user);
	
	public User loginUser(UserLogin userLogin);
	
}
