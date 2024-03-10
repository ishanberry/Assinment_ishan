package com.Project_Management_System.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.Project_Management_System.Models.Project;
import com.Project_Management_System.Repositories.ProjectRepo;

@Service
public class ProjectService {

	@Autowired
	ProjectRepo projectRepo;
	
	public List<Project> getAllProject() { //  here we get all the project from project repo 
		
		return projectRepo.findAll();
	}
	
	public Project Projectbyid (@PathVariable Long projectId) {
		
		return projectRepo.findById(projectId).orElse(null); //  either task will get or it will not get 
	}
	
	public Project ProjectSave(Project project) {
		
		
		return projectRepo.save(project); //  it will save the task 
	}
	
	public void DeleteProject(Long projectId)
	{
		
		projectRepo.deleteById(projectId);
	}
	
	
}
