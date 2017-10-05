package com.libertymutual.goforcode.votingapp.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.libertymutual.goforcode.votingapp.models.Project;
import com.libertymutual.goforcode.votingapp.models.Student;
import com.libertymutual.goforcode.votingapp.repositories.ProjectRepository;
import com.libertymutual.goforcode.votingapp.repositories.StudentRepository;


@Configuration
@Profile("development")
public class SeedData {
	
	public SeedData(StudentRepository studentRepo, ProjectRepository projectRepo ) {
		
		Student priya = new Student("Priya", "Prabhakar");
		studentRepo.save(priya);
	
		studentRepo.save(new Student("Arya", "Stark"));
		studentRepo.save(new Student("Daenerys", "Targaryen"));
		studentRepo.save(new Student("Tyrion", "Lannister"));
		studentRepo.save(new Student("Jon", "Snow"));

		Project grocery = new Project("Grocery App");
		projectRepo.save(grocery);		
		
		projectRepo.save(new Project("Assassin App"));
		projectRepo.save(new Project("Takeover 7 kingdoms app"));
		projectRepo.save(new Project("Help Daenerys app"));
		projectRepo.save(new Project("King of the North app"));	
		
	}

}


