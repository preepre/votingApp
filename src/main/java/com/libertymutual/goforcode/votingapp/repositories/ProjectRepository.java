package com.libertymutual.goforcode.votingapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libertymutual.goforcode.votingapp.models.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
	
	

}
