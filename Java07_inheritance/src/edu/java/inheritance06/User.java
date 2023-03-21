package edu.java.inheritance06;

import java.util.Objects;

public class User {
	// field
	private String userId;
	private String password;
	
	// 생성자: (1) 기본 생성자, (2) argument 2개를 갖는 생성자.
	public User() {}
	
	public User(String userId, String password) {
		this.userId = userId;
		this.password = password;
	}

	// getters & setters
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
	
	// toString() override: "User(userId=..., password=...)"
	@Override // 애너테이션을 써서 상위 클래스가 리턴타입이 
	public String toString() { // 문자열을 리턴하는 메서드이기 때문에 문자열을 리턴해주는 메서드를 만들어야한다.
		return String.format("User(userId=%s, password=%s)", userId, password); // 
	}

	// equals() override: 두 객체의 userId가 같으면 true, 그렇지 않으면 false
	// hashCode() override
	@Override
	public int hashCode() {
		return Objects.hash(userId);
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass()) // getClass 참조 변수가 가리키는 class를 찾음.
//			return false;
//		User other = (User) obj;
//		return Objects.equals(userId, other.userId);
//	}
	
	@Override
	public boolean equals(Object obj) { // Object타입을 받는다면 Car타입 TV타입 User타입... 등 Object를 상속받는 모든 클래스를 받을 수 있다.
		boolean result = false;
		if (obj instanceof User) {
			User other = ((User) obj); // obj를 Object로만 보고있기 때문에 User로 캐스팅을 한다.
			if (this.userId != null && userId.equals(other.userId)) { // userId는 String타입으로 String을 비교하는 문장이다.
				// userId가 null이라면 null일때 메서드를 부르면 nullPointException이 일어난다.
				result = true;
			}
		}
		return result;
	}
	
	

	

}
