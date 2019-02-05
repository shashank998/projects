package com.Application.Exam.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Application.Exam.entities.Submit_answer;
import com.Application.Exam.entities.Test;
import com.Application.Exam.entities.Users;
import com.Application.Exam.repository.AnswerRepository;
import com.Application.Exam.repository.SubmitRepository;
import com.Application.Exam.repository.TestRepository;
import com.Application.Exam.repository.UsersRepository;

@Service
public class ExamServices {

	@Autowired
	UsersRepository res;
	@Autowired
	TestRepository test;
	@Autowired
	AnswerRepository ares;
	@Autowired
	SubmitRepository sub;

	public String Register(String user_name, String email, String collage_name) {
		Users s = new Users();
		s.setUser_name(user_name);
		s.setEmail(email);
		s.setCollage_name(collage_name);
		res.save(s);
		return "Registration Sucessfull";
	}

	public String Addtest(String test_name, int question_id, int user_id, int topic_id) {

		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		Test t = new Test();
		String t1 = test.test(user_id);

		if (t1 == null) {

			t.setTest_name(test_name);
			t.setQuestion_id(question_id);
			t.setUser_id(user_id);
			t.setTopic_id(topic_id);
			t.setCreated_date(date);
			t.setFlag("To Do");

			test.save(t);
			return "Test created start the Test";
		} else
			return "Already created Please start the Test";
	}

	public List<Object> testpage(int topic_id, int test_id) {
		Test t = test.getOne(test_id);
		t.setFlag("Progress");
		test.save(t);

		return ares.getQuestion(topic_id);
	}

	public String Submit(int test_id, int question_id, String response, int user_id) {
		Submit_answer a = new Submit_answer();
		a.setTest_id(test_id);
		a.setQuestion_id(question_id);
		a.setResponse(response);
		a.setUser_id(user_id);
		Test t = test.getOne(test_id);
		t.setFlag("Completed");

		sub.save(a);
		return "Submit Test sucessfully";
	}

	public Submit_answer valid(int submit_id, int question_id, int user_id) {
		Submit_answer s = sub.getOne(submit_id);
		String correct_ans = ares.getCorrect_answer(question_id);
		String user_response = sub.GetResponse(question_id, user_id);

		if (correct_ans.equals(user_response)) {
			s.setScore(1);

		} else
			s.setScore(0);

		return sub.save(s);
	}

}
