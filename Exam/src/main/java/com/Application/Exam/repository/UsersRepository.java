package com.Application.Exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Application.Exam.entities.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

	/*
	 * @Query("INSERT INTO Students(email,student_name,collage_name) VALUES ('acb','abc','abc')"
	 * ) String insert(@Param("email") String name, @Param("student_name") String
	 * student_name,
	 * 
	 * @Param("collage_name") String collage_name);
	 */

}
