package edu.java.array09;

import java.lang.reflect.Array;
import java.util.Random;

public class ArrayMain09 {
	
	public static void main(String[] args) {
		// 1차원 정수(int) 배열 3개를 갖는 2차원 배열을 선언.
        // 첫번째 배열에는 난수 2개, 두번째 배열에는 난수 3개, 세번째 배열에는 난수 4개 저장.
        // 저장하는 난수의 범위는 0 이상 100 이하.
        // 2차원 배열의 원소들을 출력.
        // 2차원 배열의 모든 원소들의 합을 계산하고 출력.
        // 2차원 배열의 모든 원소들의 평균을 계산하고 출력.
        // 최댓값을 찾고 출력.
        // 최솟값을 찾고 출력.
		
		int[][] array = new int[3][];
		array[0] = new int[2];
		array[1] = new int[3];
		array[2] = new int[4];
		
		double count = 0;
		for(int[] arr : array) {
			for(int x : arr) {
				count++;
			}
		}
		
		Random random = new Random();
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				array[i][j] = random.nextInt(101);
			}
		}
		int sum = 0;
		
		for(int[] member : array) {
			for(int x : member) {
				System.out.print(x+"\t");
				sum += x;
			}
			System.out.println();
		}
		System.out.println("array의 모든 값의 합계 : "+sum);
		
		double average = sum/count;
		System.out.println("array의 모든 값의 평균 : "+average);
		
		int max = array[0][0];
		int min = array[0][0];
		
		for(int[] member : array) {
			for(int x : member) {
				// max (x<max) ? x : max;
				if(max<x) {
					max = x;
				}else if(min>x) {
					min = x;
				}	
			}
		}
		
		System.out.println("array의 모든 값의 최대값: "+max);
		System.out.println("array의 모든 값의 최소값: "+min);
		
		
			
		
	}
}
