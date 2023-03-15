package edu.java.loop01;

public class LoopMain01 {

	public static void main(String[] args) {
		// 반복문
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		System.out.println("------------");
		// for 반복문
		for (int n=1; n<=5; n++) {  // for문 안에는 반드시 ;이 2개가 들어가야한다.
			System.out.println(n);
		}
		// 증가연산자(++), 감소연산자(--): 변수의 값을 1증가/감소.
		// 증가/감소 연산자는 변수 앞 또는 뒤에 사용 (예) x++, ++x7
		
		System.out.println("------------------");
		
		// 10부터 1까지 내림차순으로 출력.
		for(int x=10; x>=1; x--) {
			System.out.println(x);
		}
		
		//  지역변수(local variable): 메서드 블록 ({}) 안에서 선언한 변수.
		//  지역변수는 선언된 위치에서부터 변수가 속한 블록({}) 안에서만 사용 가능.
		//  for() 구문에서 선언하는 변수는 for 블록 안에서만 사용 가능한 지역 변수.
		for(int x=10; x>=1; x--) {
			System.out.println(x);	
		}
		
		int x = 1; // main 메서드가 끝날 때까지 사용 가능;
		{
			int y = 2; // 지역변수 y선언 이 변수는 블록을 나가면 사용을 하지 못한다. 블록을 벗어나면 stack영역에서 사라진다.
			System.out.println("x=" + x);
			System.out.println("y=" + y);
		}
		System.out.println("x=" + x);
		// System.out.println("y=" + y); 지역변수를 지역변수가 선언된 밖에서 사용했기 때문에 에러발생
	}

}
