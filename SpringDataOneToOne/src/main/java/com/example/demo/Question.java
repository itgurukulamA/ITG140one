package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	@Column(name="question_id")
	private int questionid;
	private int question;
	
	@OneToOne
	private Answer answer;
	public Question(int questionid, int question, Answer answer) {
		super();
		this.questionid = questionid;
		this.question = question;
		this.answer = answer;
	}
	public Question() {
		// TODO Auto-generated constructor stub
	}
	public int getQuestionid() {
		return questionid;
	}
	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}
	public int getQuestion() {
		return question;
	}
	public void setQuestion(int question) {
		this.question = question;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [questionid=" + questionid + ", question=" + question + ", answer=" + answer + "]";
	}
	public void setQuestionId(int i) {
		// TODO Auto-generated method stub
		
	}
	public void setQuestion(String string) {
		// TODO Auto-generated method stub
		
	}
	

}
