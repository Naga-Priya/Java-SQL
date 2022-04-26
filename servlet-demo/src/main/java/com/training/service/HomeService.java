package com.training.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.dao.HomeDao;
import com.training.model.User;

public class HomeService implements IHomeService {
	
	public boolean validateUser (String uName, String password) throws ClassNotFoundException, SQLException {
		
		HomeDao dao = new HomeDao();
		
		List<User> userList = dao.getUsers();
		
		for(User user: userList) {
			if(uName.equalsIgnoreCase(user.getuName())&&password.equals(user.getPassword())) {
				return true;
			}
			
		}
		return false;
	}

}
