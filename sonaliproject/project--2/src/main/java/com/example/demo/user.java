package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class user
{
	@Id
	private String username;
	private String name;
	private String email;
	private int experience;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
	return "user[username=" + username + ", name=" + name + ", email=" + email + ", experience=" + experience + ", password=" + password + "]";
	
	
}

}
