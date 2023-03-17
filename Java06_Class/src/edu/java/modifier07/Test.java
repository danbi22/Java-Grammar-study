package edu.java.modifier07;

public class Test {
	int x; // static이 안붙어있는 필드를 인스턴스 필드라고한다.
	// 변수 x가 메모리에 할당되는 시점 (생성자를 호출했을 때 생김)
	static int y; // 스테틱을 붙이면 이텔릭체로 바뀐다. 일반 필드가 아닌 스테틱 필드라는 것을 의미
	// 인스턴스 메서드
	public void printInfo() {
		System.out.println("인스턴스 메서드");
		System.out.println("x= "+this.x); // 생성된 test타입의 변수 // this. 생략가능 //
		System.out.println("y= "+Test.y); // Test.생략 가능 // 클래스 이름을 붙여서 사용한다.
		// 인스턴스 메서드는 static 필드/메서드를 사용할 수 있음.
		System.out.println("===============");
	}
	public static void printStaticInfo() { // static public처럼 순서를 변경해서 사용할 수 있다 하지만 return타입은 항상 메서드 앞에 있어야한다.
		System.out.println("스테틱메서드");
//		System.out.println("x= "+x); // 인스턴스 변수 x가 메모리에 올라오지 않았기에 사용할수 없다? // 스테틱이 아닌 변수를 사용할 수 없다. 
		//static 메서드에서 인스턴스 필드/메서드를 사용할 수 없기 때문에 에러가 난다.
		System.out.println("y= "+y);
		System.out.println("===============");
		
	}

}
