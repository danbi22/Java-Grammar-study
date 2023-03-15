package edu.java.loop06;

public class LoopMain06 {

	public static void main(String[] args) {
		// do-while 반복문
		int n= 1;
		do {
			System.out.print(n+" ");
			n++;
		}while(n<=10); // 조건이 참이면 다시 do
		
		System.out.println();
		
		n=1;
		while(n<=10) {
			System.out.print(n+" ");
			n++;
		}
		
		// do-while문은 반복 여부를 검사하기 전에 무조건 블록을 한 번 실행함.
		// for, while문은 블록을 실행하기 전에 반복 여부를 먼저 검사하고, 조건이 참이면 블록을 실행함.
		System.out.println();
		
		n=1;
		while (n > 5) {  // 조건을 만족하지 않아 블록이 실행되지 않음
			System.out.print(n + " ");
			n++;
		}
		
		System.out.println();
		
		n = 1;
		do {  // 조건과 상관없이 무조건 블록이 한번 실행되고 조건의 결과에 따라 실행여부가 결정된다.
			System.out.print(n+" ");
			n++;
		}while(n > 5);
		
		
		System.out.println();
		
		
	}

}
