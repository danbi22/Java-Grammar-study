package edu.java.list04;

public class User {
	// fields:
	private String id;
	private String password;
	
	
	// constructor: (1) 기본 생성자, (2) 아규먼트 2개를 갖는 생성자
	public User() {}
	
	public User(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

	
	
	// getters & Setters
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	// toString() override
	@Override
	public String toString() {
		return String.format("User(id=%s, password=%s)", id, password);
	}
}
