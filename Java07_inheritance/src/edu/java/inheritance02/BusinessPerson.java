package edu.java.inheritance02;

import java.nio.file.spi.FileSystemProvider;

// 회사원은 사람이다. 회사원은 사람을 확장한다.
public class BusinessPerson extends Person {
	// field
	private String company;
	
	// constructor
	public BusinessPerson() {
		System.out.println("BusinessPerson() 생성자 호출.");
	}
	
	public BusinessPerson(String company) {
		this.company = company;
		System.out.println("BusinessPerson(company) 생성자 호출.");
	}
	
	public BusinessPerson(String name, String company) {
		super(name); // 부모의 생성자를 호출.
		this.company = company;
		System.out.println("BusinessPerson(name, company) 생성자 호출.");
	}
	
}
