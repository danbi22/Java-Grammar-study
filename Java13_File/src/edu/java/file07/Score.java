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

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getWeb() {
		return web;
	}

	public void setWeb(int web) {
		this.web = web;
	}

	public int getPython() {
		return python;
	}

	public void setPython(int python) {
		this.python = python;
	}
	
	@Override
	public String toString() {
		return String.format("(java=%d, web=%d, python=%d)", java, web, python);
	}
}
