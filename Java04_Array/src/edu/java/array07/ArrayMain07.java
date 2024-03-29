package edu.java.array07;

public class ArrayMain07 {

	public static void main(String[] args) {
		// 2차원 배열: 1차원 배열들을 원소로 갖는 배열.
		// 2차원 배열의 원소를 참조할 때 인덱스가 2개 필요함.
		int[][] array = { // 배열들을 ,로 구별 원소라는 뜻 원소들을 구분하는 것이,
				{1,2,3,4},
				{5,6,7,8,9},
				{10,11,12}
		};
		
		// 2차원 배열의 인덱스
//		System.out.println(array);  // 2차원 배열
//		System.out.println(array[0]);  // 2차원 배열의 인덱스 i번째 원소는 1차원 배열이 된다.
//		System.out.println(array[0][0]); // 2차원 배열에서 인덱스[i, j]번째 원소의 값은 1개
//		System.out.println(array[1][3]); // 원소 8
//		
//		// 2차원 배열의 length
//		System.out.println(array.length);
//		System.out.println(array[0].length);  // array[0] => {1,2,3,4} 
//		System.out.println(array[1].length); // array[1] => {5,6,7,8,9}
//		System.out.println(array[2].length); // array[2] => {10,11,12}
		
		// for 구문(인덱스를 사용)을 사용한 2차원 배열 출력
		for(int i=0; i<array.length; i++) {  // array[v]을 늘려가기 위한 반복문 array[v]의 길이만큼 반복한다.
			for(int j=0; j<array[i].length; j++) { // array[][v]를 늘려가기 위한 반복문 array[][v]의 길이만큼 반복한다.
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		// for-each 구문을 사용한 2차원 배열 출력
		for(int[] x : array) {  // 
			for(int y : x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}

}
