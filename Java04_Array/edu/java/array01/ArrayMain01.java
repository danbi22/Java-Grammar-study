package edu.java.array01;

public class ArrayMain01 {

	public static void main(String[] args) {
		
		// 배열(array): 같은 타입의 데이터 여러개를 하나의 변수 이름으로 저장하기 위한 메모리 공간.
		// 인덱스(index): 배열에서 데이터가 저장된 위치 나타내는 정수.
		// 배열의 인덱스는 0부터 시작한다.
		// 배열의 마지막 인덱스는 (배열 원소 개수 - 1).
		// 모든 배열은 length 속성을 가지고 있습니다.
		// length: 배열의 길이, 배열의 원소 개수를 알려준다.
		// 배열은 한가지 타입만 저장할 수 있다.
		
		// 정수(int) 4개를 저장할 수 있는 배열 선언, 초기화.
		// 배열 안에 값을 저장하지 않으면 기본 값으로 0이 저장된다.
		// 배열은 사용하기 전에 몇개짜리 배열인지 알려줘야한다.
		int[] scores = new int[4];
		
		// 배열의 특정 인덱스에 원소를 저장(재할당)
		scores[0] = 100; // [0]번 인덱스에 100저장
		scores[1] = 90;
		
		// 배열의 특정 인뎃스에 저장된 원소의 값 읽기
		// [I@372f7a8d: int 배열의 주소 값
		System.out.println(scores);
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		
		// for문으로 배열 출력
		// 인덱스는 항상 정수이기 때문에 int 변수 선언
		// i는 index의 줄임말
		for (int i = 0; i < 4; i++) {
			System.out.println(scores[i]);
		}
		
		// .length
		System.out.println("length: " + scores.length);
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		System.out.println("============");
		
		// 배열 선언 초기화 방법2
		int[] numbers = {100, 90, 0, 50, 80};
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println();
		
		numbers[2] = 99;
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("============");
		
		// 향상된 for문 (enhances for statement). for-each구문
		// 콜론의 오른쪽에는 배열의 이름을 쓴다.
		// 콜론의 왼쪽에는 배열과 같은 타입의 변수를 선언한다.
		// 오른쪽 배열에서 값을 꺼내어 왼쪽 변수에 저장한다. 값을 사용하면 배열의 순차에 따라서 값을 저장한다.
		// for (배열이 가지고 있는 타입 | 변수이름 : 배열이름){}
		for (int nums : numbers) {
			System.out.println(nums);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
