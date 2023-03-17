package edu.java.modifier06;

/*
 *  final 수식어: 최종적인. 변경할 수 없는.
 *  사용범위: 지역변수에서도 사용가능. 클래스 맴버(필드, 생성자, 메서드): 변경할 수 없는 클래스 멤버.
 *  final 지역변수: 변경할 수 없는 지역변수. 상수(constant) 초기화 이후에는 값을 변경할 수 없는 변수
 *  final은 대문자로 표기한다.
 *  final은 클래스에도 붙일 수 있다. 변경할 수 없는 클래스이다. 상속할 수 없는 클래스.
 *  final 필드(멤버 변수)는 반드시 초기화하는 문장을 명시해야 함.
 *  	(1) 필드 선언과 동시에 값을 초기화
 *  	(2) 생성자를 사용해서 값을 초기화
 */

public class ModifierMain06 {
	
	private static final int VERSION = 1; // 선언과 동시에 초기화
	
	private final int test;  // final 필드를 선언할 때 초기화하지 않는 경우에는 
	// 생성자를 이용해서 final필드를 초기화해야 함.
	public ModifierMain06() { // 
		this.test = 0;
	}
	
	public static void main(String[] args) {
		final int x =1;
//		x=2; final local variable x cannot be assigned. final로
		
//		VERSION = 2; // final 필드는 값을 재할당(변경)할 수 없음.
	}
}
