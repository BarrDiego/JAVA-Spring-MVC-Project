package com.prueba.spring.DAO;

import com.prueba.spring.entidades.User;


public interface UserDAO {

	public void registrarUser(User user);
	
	public User loginUser(String mail, String pass);
	
}
