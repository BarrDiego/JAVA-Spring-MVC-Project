package com.app.spring.DAO;

import com.app.spring.entidades.User;
import com.app.spring.entidades.UserLogin;


public interface UserDAO {

	public void registrarUser(User user);
	
	public User loginUser(UserLogin userLogin);
	
}
