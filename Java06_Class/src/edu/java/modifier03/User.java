package edu.java.modifier03;

public class User {
	// field
	private int userNo;
	private String userId;
	private String password;

	// argument 3개를 갖는 생성자
	public User(int userNo, String userId, String password) {
		this.userNo = userNo;
		this.userId = userId;
		this.password = password;
	}

	// getter, setter 메서드

	// userNo getter 메서드
	public int getuserNo() {
		return this.userNo;
	}

	// userNo setter 메서드
	public void setuserNo(int userNo) {
		this.userNo = userNo;
	}

	// userId getter 메서드
	public String getuserId() {
		return this.userId;
	}

	// userId setter 메서드
	public void setuserId(String userId) {
		this.userId = userId;
	}

	// password getter 메서드
	public String getpassword() {
		return this.password;
	}

	// getpassword setter 메서드
	public void setpassword(String getpassword) {
		this.password = getpassword;
	}
	
//	// user 만들기
//	public void makeUser() {
//		Scanner scan = new Scanner(System.in);
//		int userNo = scan.nextInt();
//		String userId = scan.next();
//		String password = scan.next();
//		User(userNo, )
		
	

}
