package edu.java.inheritance02;

public class Person {
	// field
	private String name;
	
	// constructor
	public Person() {
		System.out.println("Person() 생성자 호출");
	}
	
	public Person(String name) {
		this.name = name;
		System.out.println("Person(name) 생성자 호출");
	}
	// method
	public String getname() {
		return this.name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
}
