package edu.java.inheritance05;

// final : 변경할 수 없는
// final 지역 변수: 값을 한 번 초기화하면 그 값을 변경할 수 없는 변수(상수, constant)

// final 필드: 반드시 명시적으로 값을 초기화해야하고, 초기화된 이후에는 값을 변경할 수 없는 필드
// (1) final 필드를 선언할 때 초기화하거나
// (2) final 필드를 초기화하는 생성자가 반드시 있어야 함.
// final int x;
// public InheritanceMain05(int y){
//      this.y = y;
//}

// final 메서드: override할 수 없는 메서드. 하위 클래스에서 재정의할 수 없도록 선언한 메서드
// final 클래스: 확장할 수 없는 클래스. 상속할 수 없는 클래스.
//  (예)java.lang.System, java.lang.String, ... 등이 있음.
// 라이브러리를 만들어서 제공하는 회사에서 자기네 클래스를 활용해서 다른 클래스를 만들 수 없도록 하기 위해서

class A{
	public void test1() {
		System.out.println("test1");
	}
	
	public final void test2() {
		System.out.println("test2");
	}
}

class B extends A{
	@Override
	public void test1() {
		System.out.println("B: test1()");
	}
	
//	public void test2() {} 
// final로 선언되어 있는 메서드는 override할 수 없다.
}
public class InheritanceMain05 {
	private final int x=1; // (1)
	 private final int y;
	 
	 public InheritanceMain05(int y){ // (2)
	      this.y = y;
	 }

// class MyStirng extends String {} 
// final로 선언된 클래스는 상속할 수 없는 클래스이다.(내용을 변경하고 확장할 수 없는 클래스이다.) 
	 
	public static void main(String[] args) {
		A a1 = new A();
		a1.test1();
		a1.test2();
	}

}
