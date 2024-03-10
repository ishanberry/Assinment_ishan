package com.Project_Management_System.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project_Management_System.Models.Project;

@Repository
public interface ProjectRepo extends JpaRepository<Project, Long> {

	
}//  through this interface the crud operation logic fetching ... crud operation by this perfromed 
//  here we can performed the custome query also
