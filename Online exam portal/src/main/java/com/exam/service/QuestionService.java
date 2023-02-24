package com.exam.service;

import java.util.Set;

import com.exam.entity.Question;



public interface QuestionService {

	public Question addQuestion(Question question);
	public Question updateQuestion(Question question);
	public Set<Question> getQuestions();
	public Question getQuestion(Long questionId);
	public void deleteQuestion(long questionId);
	
}
