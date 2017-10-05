package com.libertymutual.goforcode.votingapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.libertymutual.goforcode.votingapp.repositories.ProjectRepository;
import com.libertymutual.goforcode.votingapp.repositories.StudentRepository;

@Controller
@RequestMapping("/")
public class VotingController {
	
	private StudentRepository studentRepo; 
	private ProjectRepository projectRepo;
	
	public VotingController(StudentRepository studentRepo, ProjectRepository
			projectRepo) {
		this.studentRepo = studentRepo;
		this.projectRepo = projectRepo;
		
	}
	
	@GetMapping("")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("projects", projectRepo.findAll());
		mv.addObject("students", studentRepo.findAllByOrderByFirstNameAsc());
		return mv;	
	}
	
	
	

}
