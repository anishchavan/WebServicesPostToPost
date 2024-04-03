package com.cjc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Player {
	@Id
	private int jerseyno;
	private String name;
	private String role;
	private int age;
	
	public int getJerseyno() {
		return jerseyno;
	}
	public void setJerseyno(int jerseyno) {
		this.jerseyno = jerseyno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
