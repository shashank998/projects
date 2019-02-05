package com.Application.Exam.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int user_id;
	private String user_name;
	private String email;
	private String collage_name;

	public Users() {

	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCollage_name() {
		return collage_name;
	}

	public void setCollage_name(String collage_name) {
		this.collage_name = collage_name;
	}

	public Users(int user_id, String user_name, String email, String collage_name) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.email = email;
		this.collage_name = collage_name;
	}

}