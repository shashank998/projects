package com.Application.Exam.studentsResources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Application.Exam.Service.ExamServices;
import com.Application.Exam.entities.Submit_answer;
import com.Application.Exam.repository.SubmitRepository;
import com.Application.Exam.repository.TestRepository;
import com.Application.Exam.repository.TopicsRepository;

@RestController
@RequestMapping("/Exam")
public class TestImpl {

	@Autowired
	ExamServices service;
	@Autowired
	SubmitRepository submit;
	@Autowired
	TopicsRepository reposi;
	@Autowired
	TestRepository test;

	@PostMapping("/Registeration/{user_name}/{email}/{collage_name}")
	public String Registration(@PathVariable final String user_name, @PathVariable final String email,
			@PathVariable final String collage_name) {

		return service.Register(user_name, email, collage_name);

	}

	@GetMapping("/Available_Topics")
	public List<String> Available_Topics() {

		return reposi.GetTopics();

	}

	@PostMapping("/Create_test/{test_name}/{question_id}/{user_id}/{topic_id}")
	public String CreateTest(@PathVariable final String test_name, @PathVariable final int question_id,
			@PathVariable final int user_id, @PathVariable final int topic_id) {

		return service.Addtest(test_name, question_id, user_id, topic_id);

	}

	@GetMapping("/Created_tests/{user_id}")
	public List<?> Created_Test(@PathVariable final int user_id) {
		return test.getest(user_id);
	}

	@GetMapping("/TestContents/{topic_id}/{test_id}")
	public List<Object> GetQuestion(@PathVariable Integer topic_id, @PathVariable Integer test_id) {
		return service.testpage(topic_id, test_id);

	}

	@PostMapping("/Submit_Answer/{test_id}/{question_id}/{response}/{user_id}")
	public String Submit(@PathVariable final int test_id, @PathVariable final int question_id,
			@PathVariable final String response, @PathVariable final int user_id) {

		return service.Submit(test_id, question_id, response, user_id);
	}

	@PostMapping("/Validation/{submit_id}/{question_id}/{user_id}")
	public Submit_answer valid(@PathVariable final int submit_id, @PathVariable final int question_id,
			@PathVariable final int user_id) {

		return service.valid(submit_id, question_id, user_id);

	}

	@GetMapping("/Get_Score/{user_id}")
	public int GetResult(@PathVariable final int user_id) {
		return submit.Result(user_id);
	}

}
