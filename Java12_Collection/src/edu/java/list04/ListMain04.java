package edu.java.list04;

import java.util.ArrayList;
import java.util.Scanner;

public class ListMain04 {
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ListMain04 main04 = new ListMain04();
		
		// User 타입을 저장하는 ArrayList 타입 변수 선언, 객체 생성.
		ArrayList<User> users = new ArrayList<>();
		
		// 3개의 User 객체를 ArrayList에 저장
		boolean run = true;
		while(run) {
			users.add(main04.makeUser());
			if(users.size() == 3) {
				run = false;
			}
		}
		
		// ArrayList 내용을 출력.
		System.out.println(users);
	}


	private User makeUser() {
		System.out.println("아이디를 입력하세요");
		String userId = sc.nextLine();
		System.out.println("패스워드를 입력하세요");
		String userPW = sc.nextLine();
		
		User user = new User(userId, userPW);
		return user;
	}

}
