package edu.java.modifier03;

public class Person {
	// field
	private String name;
	private int age;
	
	// constructor
	public Person(String name, int age) {
		this.name = name;  // 필드에 아규먼트를 저장하겠다.
		this.age = age;
	}
	// method
	// getter 메서드
	// 관습: 메서드 이름은 get 뒤에 변수이름을 붙여준다.
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}

	// setter 메서드
	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		} else {
			System.out.println("음수 나이는 허용디지 않음");
		}
		
	}
}
