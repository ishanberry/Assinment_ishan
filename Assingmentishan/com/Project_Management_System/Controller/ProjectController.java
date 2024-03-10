package com.Project_Management_System.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.Project_Management_System.Models.Project;
import com.Project_Management_System.Services.ProjectService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.Valid;

@RestController

@Validated
//@Api(tags = "Project Management", description = "Operations related to project management")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    // Get all projects
    
    @GetMapping("GET/projects")
   // @ApiOperation(value = "Get all projects", notes = "Retrieve all projects in the system")
    public ResponseEntity<List<Project>> getAllProjects() {
        List<Project> projects = projectService.getAllProject();
        return ResponseEntity.ok(projects);
    }

    // Get a project by ID
    @GetMapping("GET/projects/{projectId}")
   // @ApiOperation(value = "Get a project by ID", notes = "Retrieve project details based on its unique ID")
    public ResponseEntity<Project> getProjectById(@PathVariable Long projectId) {
        Project project = projectService.Projectbyid(projectId);
        if (project != null) {
            return ResponseEntity.ok(project);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
 // Update an existing project
    @PutMapping("PUT/projects/{projectId}")
    //@ApiOperation(value = "Update an existing project", notes = "Update project details based on its unique ID")
    public ResponseEntity<Project> updateProject(@PathVariable Long projectId, @Valid @RequestBody Project updatedProject) 
    {
        // First, check if the project with the given ID exists
        Project existingProject = projectService.Projectbyid(projectId);
        if (existingProject == null) 
        {
            return ResponseEntity.notFound().build();
        }
        
        // Set the ID of the updated project to match the ID of the existing project
        updatedProject.setProjectId(projectId);
        
        // Save the updated project
        Project updated = projectService.ProjectSave(updatedProject);
        
        return ResponseEntity.ok(updated);
    }


    // Create a new project
    
    @PostMapping("POST/projects")
    //@ApiOperation(value = "Create a new project", notes = "Add a new project to the system")
    public ResponseEntity<Project> createProject(@Valid @RequestBody Project project) {
        Project createdProject = projectService.ProjectSave(project);
        return new ResponseEntity<>(createdProject, HttpStatus.CREATED);
    }	

    // Delete a project by ID
    @DeleteMapping("DELETE/{projectId}")
  //  @ApiOperation(value = "Delete a project by ID", notes = "Remove a project from the system based on its unique ID")
    public ResponseEntity<Void> deleteProject(@PathVariable Long projectId) {
        projectService.DeleteProject(projectId);
        return ResponseEntity.noContent().build();
    }
}
