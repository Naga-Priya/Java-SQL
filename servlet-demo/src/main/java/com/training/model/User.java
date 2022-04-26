package com.training.model;

public class User {

	private String uName;
	
	private String password;

	/**
	 * @param uName
	 * @param password
	 */
	public User(String uName, String password) {
		this.uName = uName;
		this.password = password;
	}

	/**
	 * @return the uName
	 */
	public String getuName() {
		return uName;
	}

	/**
	 * @param uName the uName to set
	 */
	public void setuName(String uName) {
		this.uName = uName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
