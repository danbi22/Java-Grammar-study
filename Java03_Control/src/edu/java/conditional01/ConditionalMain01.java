package edu.java.conditional01;

import java.util.Scanner;

public class ConditionalMain01 {
	//The public type Conditional01 must be defined in its own file
	// Conditional01은 반드시 자신의 파일안에 있어야한다.
	// rename to file Conditional01
	// rename to type ConditionalMain01

	public static void main(String[] args) {
		try (// 조건문(conditional statement)
		Scanner scan = new Scanner(System.in)) {
			int number = scan.nextInt();
			System.out.println("입력된 숫자: "+number);
			
			if(number%2==0) {
				System.out.println("짝수입니다.");  // 조건식이 참일 때 실행할 문장(들)을 중괄호{} 안에 작성.
			} else {
				System.out.println("홀수입니다.");
			}
			
			if(number > 0) {
				System.out.println("양수입니다.");  
			} else if(number < 0) {
				System.out.println("음수입니다.");
			} else {
				System.out.println("0입니다.");
			}
		}
		System.out.println("==프로그램 끝==");
	}

}
