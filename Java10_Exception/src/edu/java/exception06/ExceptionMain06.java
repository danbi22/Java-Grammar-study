package edu.java.exception06;

import java.util.Scanner;

public class ExceptionMain06 {
	
	private Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//TODO inputInteger() 메서드 테스트 코드
		ExceptionMain06 e = new ExceptionMain06();
		System.out.println("x="+e.inputInteger());
	}
	
	public int inputInteger() {
		// TODO Scanner 를 사용해서 입력받은 정수를 리턴.
		// Integer.parseInt(sc.nextLine()); 과정에서 NumberFomatException이 발생할 수 있음. 예외가 발생하면 다시 입력하라는 기능이 있어야한다
		
		while(true) {
			try {
				int x = 0;
				System.out.print("정수 입력> ");
				x = Integer.parseInt(sc.nextLine());
				return x;
			} catch (NumberFormatException n) {
				System.out.println("정수를 입력하세요");
			}	
		}
		
	}
}
