package edu.java.exception04;

import java.util.Scanner;

public class ExceptionMain04{
	
	public static void main(String[] args) {
		// multi-catch 블록 (java 7버전부터)
		// 하나의 catch블록에서 여러개의 예외들을 처리하기 위한 문법
		// catch (Exception1 | Exception2 | Exception3 | ... 변수) { ... }
		// multi-catch 블록은 상속관계(Super-Sub 관계)에 있는 예외 클래스들은 함께 사용할 수 없음
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("x를 입력하세요> ");
			int x = Integer.parseInt(sc.nextLine());
			
			System.out.print("y를 입력하세요> ");
			int y = Integer.parseInt(sc.nextLine());
			
			System.out.printf("%d / %d = %d\n", x, y, (x / y));
			
		} catch(NumberFormatException | ArithmeticException e) { // multi-catch
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			
		}
		System.out.println("프로그램 정상 종료");
	}

}
