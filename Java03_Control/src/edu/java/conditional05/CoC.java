package edu.java.conditional05;

import java.util.Random;

public class CoC {

	public static void main(String[] args) {
		// 10 이하의 정수 난수를 만들어서 변수 number에 저장
		// String 타입 변수 everOrOdd에 number가 짝수이면 "짝수". 홀수이면 "홀수" 문자열을 저장.
		
		Random r = new Random();
		
		int number = r.nextInt(11);
			System.out.println(number);
		
		String everOrOdd = (number%2==0) ? "짝수" : "홀수";
			System.out.println(everOrOdd);
		
		System.out.println();
		
		String everOrOdd3 = "";
		if(number%2==0) {
			everOrOdd3 = "짝수";
		}else {
			everOrOdd3 = "홀수";
		}
			System.out.println(everOrOdd3);
			
			
			
//			String evenOrOdd2 = () ? "짝수" : "홀수";
	}

}
