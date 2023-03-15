package edu.java.array03;

import java.util.Random;

public class HomeWorkArray {

	public static void main(String[] args) {
		/*
		 * 정수 5개를 저장할 수 있는 배열을 선언. 0 이상 9 이하의 정수 난수 5개를 배열에 저장 배열의 내용을 출력 배열의 모든 원소의 합을
		 * 계산하고 출력 배열 원소들의 평균을 double 타입으로 계산하고 출력.
		 */
		Random random = new Random();
		int sum = 0;

		int[] randomNo = new int[5];
		for (int i = 0; i < randomNo.length; i++) {
			randomNo[i] = random.nextInt(10);
			System.out.print(randomNo[i] + " ");
			sum += randomNo[i];
		}
		System.out.println();
		double average = (double) (sum) / randomNo.length;
		System.out.println("average: " + average);
		
		
	}

}
