package edu.java.array03;

public class ArrayMain03 {

	public static void main(String[] args) {
		// Ex 1.
		// 정수(int) 10개를 저장할 수 있는 배열을 선언.
		// 배열에 순서대로 0, 2 ,4 ,6 ,8 ,10, ..., 18을 저장
		// 배열의 원소들을 한 줄로 출력하세요

//		int[] nums = new int[10];
//		// i번째 배열들을 불러오기
//		int i = 0;
//
//		for (int j = 0; j <= 18; j += 2) {
//			nums[i] = j;
//			System.out.print(nums[i] + " ");
//			if (i == 10) {
//				break;
//			}
//			i++;
//		}

//		System.out.println();

		// Ex 2.
		// boolean 10개를 저장할 수 있는 배열을 선언
		// 배열에 순서대로 true, false, true, ..., false를 저장하세요
		// 배열의 원소들을 한 줄로 출력하세요

//		boolean[] bools = new boolean[10];
//		boolean x = true;
//		// bools 10개의 배열을 호출
//		int a = 0;
//			for (int b = 0; b < 9; b++) {
//				if (b % 2 == 0) {
//					x = true;
//					bools[a] = x;
//				} else {
//					x = false;
//					bools[a] = x;
//				}
//				a++;
//			}
//			System.out.print(bools[a] + " ");

		// Ex 1.
		// 정수(int) 10개를 저장할 수 있는 배열을 선언.
		// 배열에 순서대로 0, 2 ,4 ,6 ,8 ,10, ..., 18을 저장
		// 배열의 원소들을 한 줄로 출력하세요
		int[] evens = new int[10];

		for (int k = 0; k < evens.length; k++) {
			evens[k] = k * 2;
			System.out.print(evens[k] + " ");
		}
		System.out.println();
		for (int hi : evens) {
			System.out.print(hi + " ");
		}
		System.out.println();

		// Ex 2.
		// boolean 10개를 저장할 수 있는 배열을 선언
		// 배열에 순서대로 true, false, true, ..., false를 저장하세요
		// 배열의 원소들을 한 줄로 출력하세요
		// boolean 배열의 기본값은 false이다. bit에서 0은 false이기 때문에
		// int의 기본값은 0이다
		// 실수에서의 기본 값은 0.0이다.
		
		boolean[] isEven = new boolean[10];
		
		for (int i = 0; i < isEven.length; i++) {
			if (i % 2 == 0) {
				isEven[i] = true;
			}else {
				isEven[i] = false;
			}
			System.out.print(isEven[i]+ " ");
		}
		System.out.println();
		for (boolean b : isEven) {
			System.out.print(b+ " ");
		}
	}

}
