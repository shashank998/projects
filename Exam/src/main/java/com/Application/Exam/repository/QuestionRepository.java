package com.Application.Exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Application.Exam.entities.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

	/*
	 * @Query("SELECT question_name FROM Question WHERE test_id=(:test_id)")
	 * 
	 * String getquestion(@Param("test_id") Integer id);
	 * 
	 * @Query("SELECT COUNT(*) FROM Question") int getcount();
	 */

}
