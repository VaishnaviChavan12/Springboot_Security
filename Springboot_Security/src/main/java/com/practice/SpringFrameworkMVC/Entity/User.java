package com.practice.SpringFrameworkMVC.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	int id;
	String username;
	String Password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	public User(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		Password = password;
	}
	public User() {
		super();
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", Password=" + Password + "]";
	}
	
	
	
	

}
