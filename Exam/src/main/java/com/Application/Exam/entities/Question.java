package com.Application.Exam.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "question")
public class Question {

	@Id
	private int question_id;
	private String question_name;
	private int topic_id;

	public Question() {

	}

	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

	public String getQuestion_name() {
		return question_name;
	}

	public void setQuestion_name(String question_name) {
		this.question_name = question_name;
	}

	public int getTopic_id() {
		return topic_id;
	}

	public void setTopic_id(int topic_id) {
		this.topic_id = topic_id;
	}

	public Question(int question_id, String question_name, int topic_id) {
		super();
		this.question_id = question_id;
		this.question_name = question_name;
		this.topic_id = topic_id;
	}

}
