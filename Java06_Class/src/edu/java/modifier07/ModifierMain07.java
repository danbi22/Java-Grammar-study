package edu.java.modifier07;

/*
 * 객체(object): 프로그램에서 사용하려는 대상. 회원정보, 유닛
 * 클래스(class): 객체를 만들기 위해서 작성한 코드
 * - 객체의 속성을 필드로 선언하도, 속성을 초기화하는 생성자를 가질 수 있고, 객체의 속성을 사용한 기능을 메서드로 정의하는 데이터 타입.
 * 인스턴스(): 생성된(만들어진)객체. (생성될 때 메모리에 올라온다.)
 * 인스턴스 멤버(인스턴스 필드, 인스턴스 메서드)
 * - static 수식어가 사용되지 않은 멤버.
 * - 객체를 생성한 후에 참조 변수를 사용해서 접근(사용).
 * - 인스턴스 멤버들은 jre(Java Runtime Environment)이 사용하는 메모리 공간 중에서 힙(heap)에 생성(저장)된다.
 * 
 * 스테틱 멤버(필드, 메서드)
 * - static 수식어 사용된 멤버.
 * - 객체를 생성하지 않고(생성자를 호출하지 않고) 사용할 수 있는 멤버(그 변수가 이미 메모리에 올라와 있어야한다.)
 * - 프로그램 로딩 시점(main 메서드 시작 전) jre가 메인이라는 메서드를 호출하지 전에 초기화하는 과정이 있다. (이 과정이 프로그램 로딩)
 * - jre이 사용하는 메모리 공간 중에 메서드(method) 영역에 생성됨.
 * - 클래스 이름을 사용해서 사용하는 멤버
 * - static 메서드는 static멤버(필드, 메서드)들만 사용 가능
 * -> static 메서드는 인스턴스 멤버(필드, 메서드)를 사용할 수 없음
 * - 스테틱이 꼭 필요한 경우가 있다 그런경우가 아니면 스테틱을 사용하지 않는것이 좋다.
 * 스테틱 변수들은 메모리에 생성되고 프로그램이 종료될 때 사라진다. (계속 남아 있는다) 메모리 부담이 크다
 * 어디서든 접근이 가능하다는 단점이 존재한다. 누가 변수를 바꾸는지 트래킹에 어려움이 있다.
 * 
 * stact, heap메모리에 있는 것 들은 사용이 되지 않으면 사라진다.(중간에 사라진다.)  
 * 
 */
public class ModifierMain07 {
	
	public static void test1() {
		System.out.println("test 1");
	}
	
	public void test2() {
		System.out.println("test 2");
	}

	public static void main(String[] args) {
		// static 메서드는(객체 생성 여부와 상관없이) 참조변수가 없으니 클래스 이름을 사용해서 호출(
		// 인스턴스의 경우 Test test = new Test();에서 test라는 참조변수가 있어 값들이 어디에 속해 있는지 찾을 수 있으나 static의 경우에는 
		Test.printStaticInfo();
		// static 필드는 (객체 생성 여부와 상관없이) 클래스 이름을 상용해서 접근
		// Test 타입의 객체 생성
		Test.y = 123;
		Test.printStaticInfo();
		
		Test test = new Test();
		// 참조변수 test를 사용해서 인스턴스 메서드 호출
		test.printInfo(); 
		// 참조변수 test를 사용해서 인스턴스 변수(필드)를 사용할 수 있다.
		test.x =100;
		test.printInfo();
		
		test1(); // 같은 클래스 안에 있는 메서드이기 떄문에 ModifierMain07.test1과 같이 쓰지 않고 test1로 간단하게 불러온다
		// static 메서드는 static 멤버(필드, 메서드)를 사용할 수 있음
//		test2(); // 스테틱이 아닌 메서드를 스테틱처럼 부를 수 없다. static 메서드에서 인스턴스 멤버(필드, 메서드)를 사용할 수 없다. 객체가 생성되지 않은 메서드를 실행할 수 없다
//		test2 t2 = new test2();
		// test2가 들어있는 ModifierMain07 타입의 객체를 먼저 생성.
		ModifierMain07 app = new ModifierMain07(); // app참조변수 ModifierMain07이라는 
		// 클래스 이름은 변수를 사용할때 사용한 변수 타입이다.
		app.test2();
		
		
	}

}
