package edu.java.interface03;

/*
 *  자바는 다중 상속을 제공하지 않음. 2개 이상의 클래스를 상속할 수 없음.
 *  
 */
class A {}
class B {}
class C extends A {}
//class D extends A, B {} // 문법 오류 2개 이상의 클래스를 상속할 수 없음.

// 클래스에서 구현하는 인터페이스의 개수는 제한이 없음.
interface E {}
interface F {}
class G implements E, F {} // class G는 하위 타입, interface E, F는 상위 타입. 2개 인터페이스를 구현하는 클래스
class H extends A implements E, F {} // 1개 클래스를 상속하고 2개 인터페이스를 구현하는 클래스

// 인터페이스는 다른 인터페이스를 확장(상속)할 수 있음.
// 자바에서 클래스는 단일 상속만 가능하지만, 인터페이스는 다중 상속이 가능하다.
interface I extends E, F {} // 다중상속이 가능하다.

// 인터페이스는 클래스를 확장(상속)할 수 없다.
//interface J extends A {} 
//-> 슈퍼인터페이스는 인터페이스여야한다. 상위 인터페이스는 인터페이스여야한다. 문법 오류. 인터페이스는 머만 가능한데 클래스에 있는 다른것들을 상속받을 수 없다.

interface Buyer {
	static void test() {}
	void buy(); // public abstract 메서드
	
	// default (인스턴스)메서드: 객체를 생성한 뒤 사용가능 
	default void register() {
		System.out.println("구매자 등록");
	}
}

interface Seller{
	static void test() {}
	void sell(); // public abstract 메서드
	
	// default (인스턴스)메서드
	default void register() {
		System.out.println("판매자 등록");
	}
}

// 자바가 다중상속을 지원하지 않았던 이유: 같은 이름의 메서드를 가지고 있을 수 있기 때문에 그것을 구별 할 수 없다.
class User implements Buyer, Seller {
	@Override // Buyer 인터페이스의 추상 메서드를 구현
	public void buy() {
		System.out.println("구매");		
	}
	
	@Override // Seller 인터페이스의 추상메서드를 구현
	public void sell() {
		System.out.println("판매");
	}
	// 중복되는 default 메서드가 2개의 인터페이스에 있는 경우에는 반드시 override
	@Override
	public void register() {
		// 상위인터페이스.super.메서드() 호출
		Buyer.super.register(); // Buyer 인터페이스의 default 메서드가 호출됨.
		Seller.super.register(); // Seller 인터페이스의 default 메서드가 호출됨.
	}
	
}

public class InterfaceMain03 {

	public static void main(String[] args) {
		User u1 = new User();
		u1.register();
		u1.buy();
		u1.sell();
		
	}
}
