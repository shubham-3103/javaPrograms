package com.edu;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Employee {
	@NotBlank(message="username cannot be empty")
	private String name;
	@Size(min=5,message="password is required")
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
