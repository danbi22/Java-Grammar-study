package edu.java.inner01;

import edu.java.inner01.Outer.Inner;
import edu.java.inner01.Enclosing.Nested;
/*
 * 변수 선언 위치:
 * 1. 필드: 클래스의 멤버로 선언하는 변수
 * 		(1) 인스턴스 필드: static이 아닌 필드
 * 			-> 객체를 생성한 후에, 그 참조 변수로 접근해서 사용하는 변수
 * 			-> 접근 수식어(private, protected, public)을 사용할 수 있음.
 * 		(2) 클래스 필드: static으로 선언된 필드
 * 			-> 프로그램이 시작될 때, 클래스 로더에 의해서 메모리에 미리 로딩되는 변수.
 * 			-> 클래스 이름으로 접근
 * 2. 지역 변수: 메서드 안에서 선언한 변수
 * 		- 선언된 위치에서부터 변수가 포함된 블록({...})이 끝날 때까지만 사용 가능
 * 		- 파라미터 지역 변수의 한 종류.
 * 		- 지역 변수는 static으로 선언할 수 없음.
 * 		- 접근수식어(private, protected, public)를 사용할 수 없음.
 *		- final만 사용가능 -> final은 어디서든 사용가능
 *
 *	외부 클래스 / 외부 인터페이스(outer/enclosing class/interface): 내부 클래스/인터페이스를 감싸고 있는 클래스/인터페이스.
 * 내부 클래스 / 내부 인터페이스(inner class/ inner interface): 다른 클래스/인터테이스 안에서 선언하는 클래스
 * 1. 멤버 내부 클래스: 필드를 선언하는 위치에서 선언하는 클래스. 접근 수식어를 사용할 수 있음.
 * 		(1) 인스턴스 내부 클래스: static이 아닌 내부 클래스
 * 			- 외부 클래스의 객체를 먼저 생성하고 난 후에, 그 참조 변수로 접근해서 사용하는 클래스
 * 		(2) static 내부 클래스: static으로 선언한 내부 클래스
 * 			- 외부 클래스의 객체 생성 여부와 상관없이 사용할 수 있는 클래스.
 * 			- 중첩 클래스(nested class)
 * 2. 지역 내부 클래스: 메서드 안에서 선언하는 클래스.
 * 3. 익명 (내부) 클래스(anonymous class): 이름이 없는 내부 클래스
 * 		- 클래스 선언과 동시에 객체 생성까지 해야만 하는 클래스 
 */

public class InnerMain01 {
	public static final int MAX = 5; // 클래스(static) 변수 // InnerMain01.MAX -> 메모리 Method영역
	private int x; // 인스턴스(생성된 객체) 변수 -> 메모리 Heap 영역
	
	public static void main(String[] args) {
		System.out.println("MAX= " + MAX); // 클래스(static) 변수, InnerMain01.MAX // 같은 클래스 안에서는 생략 가능.
		
		InnerMain01 app = new InnerMain01(); // 인스턴스 필드가 메모리에 올라옴 // 생성자 호출 -> 인스턴스 필드가 메모리에 생성
		System.out.println("x = " + app.x); // -> app: 참조 변수
		
//		private int y;
//		static int y;
		// 지역 변수는 final 수식어만 가능.
		
		// 외부 클래스 Outer 타입의 객체 생성
		Outer outer1 = new Outer(1, 2,"안녕");
		System.out.println(outer1);
		
		// 내부 클래스 Inner 타입의 객체를 생성.
		// 인스턴스 내부 클래스는 외부클래스의 참조 변수(outer1)를 사용해야 생성자를 호출할 수 있음.
		
//		Outer.Inner inner1 = outer1.new Inner(123); // import 문 없는 경우
		Inner inner1 = outer1.new Inner(123); // import 문 있는 경우
		inner1.printInfo();
		
		Outer.Inner inner2 = outer1.new Inner(111);
		inner2.printInfo();
	
		System.out.println(Enclosing.var); // static 멤버 변수
		Enclosing outer2 = new Enclosing(1);
		System.out.println(outer2);
		
		Nested nested2 = new Nested(456); // import 문 있는 경우
		Enclosing.Nested nested = new Enclosing.Nested(321); // import 문 없는 경우
		nested.printInfo();
		
		
		
		
		
		
		
		
		
		
		
	}
	
}

