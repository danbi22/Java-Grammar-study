package edu.java.file07;

import java.io.Serializable;

public class Student implements Serializable{
	// field
	private int id;
	private String name;
	private Score score;
	
	
	//constructor
	public Student() {}
	
	public Student(int id, String name, Score score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}
	
	//method
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return String.format("Student(id=%d, name=%s, score=%s)", id, name, score);
	}
}
