package edu.java.inheritance06;

public class StringTest {
	
	public static void main(String[] args) {
		// 상수(constant): final로 선언된 변수
		// 리터럴(literal): 만들어진 값.
		int x = 1;
		x = 100; // 바꿀수 있는 수 변수
		final int y = 1; // x: 변하지 않는 수 상수 1: 리터럴. 
		
		String s1 = "hello"; // s1: 변수, "hello": 문자열 리터럴
		String s2 = "hello";
		System.out.println(s1 == s2);
		// true: jvm은 같은 문자열 리터럴은 두 번 생성하지 않음.
		
		String s3 = new String("hello");
		String s4 = new String("hello");
		System.out.println(s3 == s4);
		// false: 생성자는 호출할 때마다 새로운 객체를 힙(heap) 메모리에 생성. // 주소 값이 다르다
		// 그래서 문자열 비교할 때는 equals만 쓰자
	}

}
