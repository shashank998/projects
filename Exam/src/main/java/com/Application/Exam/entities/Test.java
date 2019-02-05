package com.Application.Exam.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test", catalog = "online_exams")
public class Test {

	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	private int test_id;
	private String test_name;
	private int question_id;
	private int user_id;
	private int topic_id;
	private Date created_date;
	private String flag;

	public Test() {

	}

	public int getTest_id() {
		return test_id;
	}

	public void setTest_id(int test_id) {
		this.test_id = test_id;
	}

	public String getTest_name() {
		return test_name;
	}

	public void setTest_name(String test_name) {
		this.test_name = test_name;
	}

	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getTopic_id() {
		return topic_id;
	}

	public void setTopic_id(int topic_id) {
		this.topic_id = topic_id;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public Test(int test_id, String test_name, int question_id, int user_id, int topic_id, Date created_date,
			String flag) {
		super();
		this.test_id = test_id;
		this.test_name = test_name;
		this.question_id = question_id;
		this.user_id = user_id;
		this.topic_id = topic_id;
		this.created_date = created_date;
		this.flag = flag;
	}

}