package com.Application.Exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Application.Exam.entities.Submit_answer;

@Repository
public interface SubmitRepository extends JpaRepository<Submit_answer, Integer> {

	@Query("SELECT response FROM Submit_answer WHERE question_id=:question_id and user_id=:user_id ")

	String GetResponse(@Param("question_id") int question_id, @Param("user_id") int user_id);

	@Query("SELECT SUM(score) FROM Submit_answer where user_id=:user_id")
	int Result(@Param("user_id") int user_id);

}
