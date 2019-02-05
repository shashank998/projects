package com.Application.Exam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Application.Exam.entities.Topics;

@Repository
public interface TopicsRepository extends JpaRepository<Topics, Integer> {

	@Query("SELECT topic FROM Topics ")
	List<String> GetTopics();

}
