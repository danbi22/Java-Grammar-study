package edu.java.conditional05;

import java.util.Random;  //java.util 패키지의 Random 타입을 (변수 선언에서) 사용하겠다.

public class ConditionalMain05 {

	public static void main(String[] args) {
		// 난수 생성방법(random number)
		Random random = new Random();  // Random 타입의 변수를 선언하고 초기화
		
		
		int x = random.nextInt(5); //0이상 5미만의 정수 난수를 만듬
		System.out.println("x: "+x);
		
		int y = random.nextInt(5);
		System.out.println("y: "+ y);
		
		
		// int 타입의 bigger 변수에 x와 y 중에서 더 큰 수를 저장
		int bigger = 0;
		
		if(x>y) {
			bigger = x;
			System.out.println("x가 더 큽니다."+bigger);
		} else if(y>x){
			bigger = y;
			System.out.println("y가 더 큽니다."+bigger);
		} else {
			System.out.println("x와 y의 값은 같습니다. x: "+x+"  y: "+y);
		}
		System.out.println();
		// 삼항 연산자
		int bigger2 = (x > y) ? x : y;  // 조건식 ? true : false
		System.out.println("bigger2: "+bigger2);
		
		// int 타입의 diff 변수에 x와 y의 차이(|x - y|)를 저장.
		
		
		int diff = (x > y) ? (x-y) : (y-x);
		System.out.println("차이: "+diff);
		
		int diff2 = 0;
		if(x>y) {
			diff2 = x-y;
		}
		
		// 10 이하의 정수 난수를 만들어서 변수 number에 저장
		// String 타입 변수 everOrOdd에 number가 짝수이면 "짝수". 홀수이면 "홀수" 문자열을 저장.
		
		
	}

}
