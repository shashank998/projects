package com.Application.Exam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Application.Exam.entities.Answer;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Integer> {

	@Query("SELECT q.question_name,a.option1,a.option2,a.option3,a.option4 FROM Question q,Answer a,Topics t "
			+ "WHERE q.question_id=a.question_id and t.topic_id=:topic_id ")

	List<Object> getQuestion(@Param("topic_id") int topic_id);

	@Query("select correct_answer from Answer where question_id=:question_id")
	String getCorrect_answer(@Param("question_id") Integer question_id);

	/*
	 * @Query("SELECT student_answer from Answer where question_id=:question_id")
	 * int getStudent_answer(@Param("question_id") Integer question_id);
	 */

}
