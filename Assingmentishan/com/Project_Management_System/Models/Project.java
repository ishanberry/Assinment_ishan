package com.Project_Management_System.Models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity

public class Project {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)// unique 
	private Long ProjectId;
	
	@NotBlank(message = "Project name can not be blank ")
	
	@Size(max = 50 ,message = "oops limit exceed")
	private String ProjectName;
	
	@NotBlank(message = "Project Description can not be blank ")
	@Size(max = 100 ,message = "oops limit exceed")
	private String ProjectDescription;
	
	@NotNull(message = "Start  date cannot be null")
    private LocalDate startDate;

    @NotNull(message = "End date cannot be null")
    private LocalDate endDate;


	
	
	
	
	public Project(Long projectId,
			@NotBlank(message = "Project name can not be blank ") @Size(max = 50, message = "oops limit exceed") String projectName,
			@NotBlank(message = "Project Description can not be blank ") @Size(max = 100, message = "oops limit exceed") String projectDescription,
			@NotBlank(message = "mandatory field cannot be blank ") LocalDate startDate,
			@NotBlank(message = "mandatory field cannot be blank ") LocalDate endDate) {
		super();
		ProjectId = projectId;
		ProjectName = projectName;
		ProjectDescription = projectDescription;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	

	public Long getProjectId() {
		return ProjectId;
	}

	public void setProjectId(Long projectId) {
		ProjectId = projectId;
	}

	public String getProjectName() {
		return ProjectName;
	}

	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}

	public String getProjectDescription() {
		return ProjectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		ProjectDescription = projectDescription;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}



	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Project [ProjectId=" + ProjectId + ", ProjectName=" + ProjectName + ", ProjectDescription="
				+ ProjectDescription + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	
	
	
	
}
