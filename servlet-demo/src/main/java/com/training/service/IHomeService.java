package com.training.service;

import java.sql.SQLException;

public interface IHomeService {
	
	public boolean validateUser (String uName, String password) throws ClassNotFoundException, SQLException;

}
