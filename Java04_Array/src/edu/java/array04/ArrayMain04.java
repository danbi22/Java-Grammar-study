package edu.java.array04;

import java.util.Random;

public class ArrayMain04 {

	public static void main(String[] args) {
		// 정수 5개를 저장할 수 있는 배열을 선언.
		// 0 이상 9 이하의 정수 난수 5개를 배열에 저장
		// 배열의 내용을 출력
		// 배열의 모든 원소의 합을 계산하고 출력
		// 배열 원소들의 평균을 double 타입으로 계산하고 출력.
		Random r = new Random();

		int sum = 0;
		double average = 0;
		int[] num = new int[5];

		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(10);
		}

		for (int x : num) {
			System.out.print(x + " ");
			sum += x;
		}
		System.out.println("\n\n총합 : " + sum);

		System.out.println();

		average = (double) sum / num.length;
		System.out.println("평균: " + average);

		// 배열의 원소들 중 최댓값을 찾고 출력
		int max = num[0];
		for (int x : num) {
			if (x > max) {
				max = x;
			}
		}
		System.out.println("max 값 : "+max);
		
		// 배열의 원소들 중 최솟값을 찾고 출력
		int min = num[0]; // 기준을 만들고
		for (int y : num) {  // 배열의 값을 하나씩 들고와서
			if (y < min) {  // 배열의 값이 기준보다 작은지 검사하여 
				min = y;  // 기준보다 작을 경우 min 값에 저장하여 대체한다.
			}
		}
		System.out.println("min 값 : "+min);
	}

}
