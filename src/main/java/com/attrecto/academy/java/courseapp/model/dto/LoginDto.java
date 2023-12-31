package com.attrecto.academy.java.courseapp.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

@Schema
public class LoginDto {
	@NotBlank
	@Schema(description = "Login name", example = "admin")
	private String userName;
	@NotBlank
	@Schema(description = "Password of the user", example = "password")
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
