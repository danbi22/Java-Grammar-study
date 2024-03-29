package edu.java.interface01;

// import static 문장: static으로 선언된 필드(변수), 메서드, 클래스 이름을 가져올 때 사용하는 것이 import static 
//  
import static edu.java.interface01.DatabaseModule.DB_VERSION;

// 인터페이스(interface):
// 사용 목적: 팀/회사 간의 분업/협업을 위해서 메서드(기능)들의 프로토타입(prototype, signature)을 약속하는 것. 이것이 interface
// 메서드를 직접 구현하는 것이 아니라 이 메서드는 이러한 기능을 할 것이라는 정의만을 내려 놓는 것.
// 큰 회사의 여러개의 개발팀이 있다. 어떠한 화면을 만들어야하는데 그 안에는 글, 테이블, 사진 등을 구현해야한다.
// 팀별로 글을 쓰는 곳을 만드는 팀, 테이블을 만드는 팀, 사진을 만드는 팀 등이 있을 것이다.
// DB팀은 바디를 만들어야하는데 ui
// 기능을 만들면 ui팀이 메서드를 호출할 수 있도록해야하는데 
// 우리메서드를 무슨 이름으로 부를 게 리턴 타입은 어떻게 해줘 등을 정하는 것이다.
// 인터페이스가 가질 수 있는 멤버들: 
// (1) public static final 필드. // 다른 필드는 만들 수 없다. // 무조건 상수(들)만 만들 수 있다. / 필드 선언할 때 보통 public static final은 생략 가능
// (2) public abstract 메서드 // 메서드를 선언만 할 수 있다. // 구현을 하지 못한다. // 메서드를 선언할 때 보통 public abstract는 생략 가능
// 인터페이스는 작성할 때는 interface 키워드를 사용.
//  
// 인터페이스는 객체를 생성할 수 없음.
// 인터페이스를 구현하는 클래스를 작성하고, 그 클래스의 객체를 생성함.
// 
public class InterfaceMain01 {
	
	public static void main(String[] args) {
		System.out.println(DB_VERSION); // public, static으로 선언하지 않았는데 보인다.
		// import static 문장을 사용하면 DatabaseModule.DB_VERSION을 간단히 DB_VERSION으로 사용할 수 있음.
		
//		DatabaseModule.DB_VERSION = 2; // final로 선언하지 않았지만 interface는 항상 final이기 때문에 변경을 할 수 없다. 
		
//		new DatabaseModule(); // DatabaseModule 타입으로는 생성자를 만들 수 없다.
		// 인터페이스는 객체를 생성할 수 없다.
		
		// 인터페이스를 구현하고 있는 클래스의 객체는 생성할 수 있음.
//		OracleDatabaseModule db = new OracleDatabaseModule();
//		MariaDBModule db = new MariaDBModule();
		
		// 다형성: SuperType var = new SubType();
		// 인터페이스 이름도 구현 클래스들의 상위 타입으로 사용할 수 있음
//		DatabaseModule db = new MariaDBModule();
		DatabaseModule db = new OracleDatabaseModule();
		
		db.insert("abcd", 100);
		db.select();
		
		
	}

}
