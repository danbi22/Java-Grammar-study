package edu.java.array02;

public class ArrayMain02 {

	public static void main(String[] args) {
		// 문자열 3개를 저장할 수 있는 배열(names)을 선언, 초기화.
		
		String[] names = new String[3];
		
		// 배열 names에 문자열을 저장.
		names[0] = "이찬희";
		names[1] = "지대한";
		names[2] = "김다훈";
//		names[3] = "유다한";
		
		// 만약에 배열을 넘는 값을 저장하려고 하면 ArrayIndexOutOfBoundsException(배열의 범위를 벗어났다.)	Index 3 out of bounds for length 3(길이 3의 인덱스 중 3번 인덱스가 범위를 벗어났다.)
		
		// 배열 names의 내용을 한 줄로 출력
		// (1) for 구문
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]+" ");
		}
		
		System.out.println();
		
		// String타입의 배열의 값을 담을 String 변수선언
		// 배열의 값을 순차적으로 String 타입의 변수인 friends에 저장
		// (2) for-each 구문
		for(String friends : names) {
			System.out.print(friends+" ");
		}
		System.out.println();
		
		String subjects[] = {"Java", "SQL", "HTML", "JavaScript"};
		for(String sub : subjects) {
			System.out.print(sub+" ");
		}
	}

}
