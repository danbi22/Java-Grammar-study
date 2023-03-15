package edu.java.variable04;

import java.util.Scanner;  // import: 가져오다. java 밑에 util. util

public class VariableMain04 {

	public static void main(String[] args) {
		// 콘솔 창에서 키보드로 정수를 입력받아서 변수에 저장하는 방법.
		// 1. Scanner 타입의 변수를 선언하고 초기화.
		Scanner sc = new Scanner(System.in); // System.in: 입력장치 ex) 키보드 마우스
		
		System.out.println("정수를 입력하세요");
		
		// 2. Scanner 객체를 사용해서 콘솔 창에서 정수를 입력받고 변수에 저장.
		int x = sc.nextInt();  // . 연결연산자 / nextInt 정수를 읽어들인다. 엔터를 칠때 입력된다.
		System.out.println("x = "+x);
		System.out.println();
		
//		sc.nextLine();
		
		System.out.println("연산자를 입력하세요");
		String op = sc.next();
		System.out.println(op);
		System.out.println();
		
		// 변수 y에 입력 받은 정수를 저장.
		// x + y, x - y, x * y, x / y, x % y 결과를 출력
		System.out.println("두번째 정수를 입력하세요");
		int y = sc.nextInt();
		System.out.println("y = "+y);
		System.out.println();
		
		// 사칙연산의 결과를 저장할 변수를 선언.
		int result = x+y;
		System.out.println("더하기: " + result);
		
		result = x - y;
		System.out.println("빼기: " + result);
		
		result = x * y;
		System.out.println("곱하기: " + result);
		
		result = x / y;
		System.out.println("나누기: " + result);
		// 나누기 연산자
		// 1. (정수) / (정수) = 나눈 몫
		// 2. (실수) / (실수) = 소수점까지 나누기 계산.
		// 3. (실수) /  (정수) 또는 (정수) / (실수) = 소수점까지 나누기 계산.
		result = x % y;
		System.out.println("나머지: " + result);
		// 나머지 연산자
		// 정수의 연산에서만 사용한다. 실수의 연산에서는 사용하지 않는다.
		// 등호(=)는 가장 연산순위가 늦다
		
		if(op.equals("+")) {
			System.out.println("x + y = " +(x+y));
		} else if(op.equals("-")) {
			System.out.println("x - y = " +(x-y));
		} else if(op.equals("*")) {
			System.out.println("x * y = " +(x*y));
		} else if(op.equals("/")) {
			System.out.println("x / y = " +(x/y));
		} else if(op.equals("%")) {
			System.out.println("x % y = " +(x%y));
		}

	}

}
