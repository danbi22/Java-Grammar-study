package edu.java.loop05;

public class LoopMain05 {

	public static void main(String[] args) {
		
		// 1~ 10 정수들을 오름차순으로 한 줄에 출력
		for(int i = 1; i <= 10; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		// while 반복문
		int i = 1;
		while(i <= 10) { 
			System.out.print(i + " ");
			i++;
		}
		
//		while(i <= 10) { // 무한 loop
//			System.out.print(i + " ");
//		}
		
		System.out.println();
		
		// 출력 결과: 1 3 5 7 9
		
		for(int n=1; n<10; n+=2) {
			System.out.print(n+" ");
		}
		
		System.out.println();
		
		int e =1;
		while(e<10) {
			System.out.print(e+" ");
			e+=2;
		}
		
		System.out.println();
		e = 1;  // while문과 별도의 문장
		while(e<=10) {  // true이면 실행을 한다.
			if(e%2==1) { // 실행한다.
				System.out.print(e+" ");
			}
			e++;
		}// 실행이 끝나면 다시 조건문으로가서 검사를 한다.
		
	}

}
