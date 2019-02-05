package com.Application.Exam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Application.Exam.entities.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, Integer> {

	@Query("SELECT test_name,created_date,flag FROM Test where user_id=:user_id")
	List<?> getest(@Param("user_id") int user_id);

	@Query("SELECT flag FROM Test where user_id=:user_id")
	String test(@Param("user_id") int user_id);

}
