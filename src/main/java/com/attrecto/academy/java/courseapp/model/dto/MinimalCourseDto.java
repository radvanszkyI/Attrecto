package com.attrecto.academy.java.courseapp.model.dto;


import java.util.Date;

import com.attrecto.academy.java.courseapp.model.dto.CustomValidators.ValidDate;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

public class MinimalCourseDto {
	@NotBlank
	@Schema(description = "Id of the course", example = "1")
	private int id;
	@NotBlank
	@Schema(description = "Title of the course", example = "Spring boot")
	private String title;
	@NotBlank
	@Schema(description = "Description of the course", example = "Java fundamentals and Spring Boot")
	private String description;
	@NotBlank
	@Schema(description = "URL for the course", example = "https://attrecto.com/academy/course/java")	
	private String url;

	
	@ValidDate
	@NotBlank
	@Schema(description = "start and end date of course", example = "[2020.01.01,2020.06.31]")	
	private Date[] datePriod= new Date[2];

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Date[] getDatePriod() {
		return datePriod;
	}
	public void setDatePriod(Date[] datePriod) {
		this.datePriod = datePriod;
	}

	
}
