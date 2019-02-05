package com.Application.Exam.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "submit_answer")
public class Submit_answer {

	@Id
	private int submit_id;
	private int test_id;
	private int question_id;
	private String response;
	private int user_id;
	private int score;

	public Submit_answer() {

	}

	public int getSubmit_id() {
		return submit_id;
	}

	public void setSubmit_id(int submit_id) {
		this.submit_id = submit_id;
	}

	public int getTest_id() {
		return test_id;
	}

	public void setTest_id(int test_id) {
		this.test_id = test_id;
	}

	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Submit_answer(int submit_id, int test_id, int question_id, String response, int user_id, int score) {
		super();
		this.submit_id = submit_id;
		this.test_id = test_id;
		this.question_id = question_id;
		this.response = response;
		this.user_id = user_id;
		this.score = score;
	}

}
