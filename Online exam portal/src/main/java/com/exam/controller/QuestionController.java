package com.exam.controller;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.entity.Question;
import com.exam.service.QuestionService;



@RestController
@RequestMapping("/question")
public class QuestionController {
	@Autowired
	private QuestionService Service;
	
	
	// add question service 
	@PostMapping("/")
	public ResponseEntity<Question> add(@RequestBody Question question)
	{
		return ResponseEntity.ok(this.Service.addQuestion(question));
	}
	//update question
	@PutMapping("/")
	public ResponseEntity<Question> update(@RequestBody Question question)
	{
		return ResponseEntity.ok(this.Service.updateQuestion(question));
		
	}
	//getting  all question of any quid
	
		// get single question
	@GetMapping("/{quesid}")
	public  Question get(@PathVariable("quesid") long quesid){
		{
			return  this.Service.getQuestion( quesid);
		}
	}

	// delete the quiz 
	@DeleteMapping("/{quesid}")
	public void delete(@PathVariable("quesid") long quesid)
	{
		this.Service.deleteQuestion(quesid);
	}
	
	
}
