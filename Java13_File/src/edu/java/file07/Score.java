package edu.java.file07;

import java.io.Serializable;

public class Score implements Serializable{
	//field
	private int java;
	private int web;
	private int python;
	
	
	// constructor
	public Score() {}
	
	public Score(int java, int web, int python) {
		super();
		this.java = java;
		this.web = web;
		this.python = python;
	}
	// method
}
