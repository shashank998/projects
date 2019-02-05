package com.Application.Exam.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "topics")
public class Topics {

	@Id
	private int topic_id;

	private String topic;

	public int getTopic_id() {
		return topic_id;
	}

	public void setTopic_id(int topic_id) {
		this.topic_id = topic_id;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public Topics(int topic_id, String topic) {
		super();
		this.topic_id = topic_id;
		this.topic = topic;
	}

}
