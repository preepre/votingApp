package com.libertymutual.goforcode.votingapp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libertymutual.goforcode.votingapp.models.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
	List<Student> findAllByOrderByFirstNameAsc();
	

}
