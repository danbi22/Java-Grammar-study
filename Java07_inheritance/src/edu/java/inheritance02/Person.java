package edu.java.inheritance02;

public class Person {
	// field
	private String name;
	
	// constructor
	public Person() { // 상속받은 클래스 중 파라미터를 생략한 생성자가 있다면 super클래스의 기본생성자가 있어야한다. 생략한 파라미터에서 super에 기본생성자를 부르기 때문. 
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
