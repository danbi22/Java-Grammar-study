package edu.java.interface02;

// 인터페이스가 가질 수 있는 멤버들 - Java 7, 8, 9 이후
// 1. [public static final] 필드: Java 7
// 2. [public abstract] 메서드: Java 7. body가 없음. 하위 클래스에서 구현하는 것을 목적으로 하는 메서드
// 3. [public] default 메서드: body가 구현된 메서드. Java 8 버전부터 사용 가능.
//     -> 인터페이스를 구현하는 (하위) 클래스의 객체를 생성한 후에 사용하는 메서드.
// 4. [public] static 메서드: body가 구현된 static메서드. Java 8 버전부터 사용 가능.
//     -> 객체 생성 없이 인터페이스 이름 또는 구현하고 있는 (하위)클래스 이름으로 접근(.)해서 사용하는 메서드
// 5. private static 메서드: body가 구현된 private static 메서드. Java 9 버전부터 가능.
//     -> 인터페이스의 default메서드(3)와 public static 메서드(4) 안에서만 사용하기 위한 메서드.
// 6. private 메서드: body가 구현된 private메서드. Java 9 버전부터 가능.
//     -> 인터페이스의 default 메서드(3)에서만 사용하기 위한 메서드.
// 추가 문법들이 생긴이유 컬랙션 프레임워크가 변경되었기 때문. 편리한 기능이 추가가 되었다.
// 인터페이스는 상수가 아닌 필드를 생성할 수 없다.
// 

interface Test{
	// 1. [public static final] 필드:
	int VERSION = 1;
	
	// 2. [public abstract] 메서드:
	void test(); // body가 없음. 하위 클래스에서 구현하는 것을 목적으로 하는 메서드
	
	// 3. [public] default 메서드:
	default void defaultMethod() { // 
		System.out.println("공개 디폴트 메서드");
	}
	
	// 4. [public] static 메서드:
	static void staticMethod() {
		System.out.println("공개 static 메서드");
	}
	
	// 5. private static메서드:
	private static void privateStaticMethod() {
		System.out.println("비공개 static 메서드");
	}
	
	// 6. private 메서드:
	private void privateInstanceMethod() {
		System.out.println("비공개 인스턴스 메서드");
	}
}

class TestImpl implements Test {

	@Override
	public void test() {
		System.out.println("인터페이스 추상 메서드 구현.");
	}
	
}
public class InterfaceMain02 {
	
	public static void main(String[] args) {
		System.out.println(Test.VERSION);
		Test.staticMethod();
		
		Test t = new TestImpl();
		t.test(); // 하위클래스(TestImpl)에서 구현한 메서드
		t.defaultMethod(); // 인터페이스에서 기본(defualt)으로 구현되어 있는 메서드.
	}
}
