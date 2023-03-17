package edu.java.scanner.test;

import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		// Scanner 클래스의 메서드들
		Scanner scanner = new Scanner(System.in);
		
		// nextInt(): 토큰(공백, 탭, 엔터)으로 구분된 문자들을 읽어서 정수 변환하고 리턴.
		// nextDouble(): 토큰(공백, 탭, 엔터)으로 구분된 문자들을 읽어서 실수 변환하고 리턴.
		// next(): 토큰(공백, 탭, 엔터)으로 구분된 문자열을 읽고 리턴.
		// -> 공백 뒤에 다른 문자열 입력들이 남아 있으면, 
		// 입력 버퍼에 읽지 않은 문자열들이 남아 있음.
		
		// nextLine(): 줄바꿈(엔터)를 만날 때까지 입력된 모든 문자들을 읽고 리턴.
		
		System.out.print("정수를 입력> ");
		int n = scanner.nextInt();
		scanner.nextLine();
		System.out.println("n = "+n);
		
		System.out.print("문자열 입력> ");
		String s = scanner.next(); 
		// next()는 공백을 만나면 읽는 것을 멈춘다. 공백 뒤에 데이터가 남아있다면 scanner가 가지고 있다가 다른 읽는 메서드(nextInt()등)가 오면 그 데이터를 읽는다
		scanner.nextLine();
		System.out.println("s = "+s);
		
		System.out.print("정수를 입력> ");
		n = scanner.nextInt();
		scanner.nextLine();
		System.out.println("n = "+n);
		
		System.out.println("실수 입력> ");
		double x = Double.parseDouble(scanner.nextLine());
		// 콘솔창에서 엔터가 입력될 때까지 입력된 모든 문자들을 읽고, double 타입으로 변환
		System.out.println("x= "+x);
	}
}
