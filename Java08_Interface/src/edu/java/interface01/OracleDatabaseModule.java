package edu.java.interface01;

// 인터페이스를 구현하는 클래스 작성: class 클래스 이름 implements Interface 이름 { ... } 을 넣어주면 된다.
// 인터페이스를 실제 클래스로 구현할 떄는 implements를 쓴다.
// 구현(implements): 추상 메서드의 바디를 작성(override)
public class OracleDatabaseModule implements DatabaseModule { // 에러가 나는 이유 인터페이스는 추상메서드를 가지고 있기 때문. 추상메서드를 구현해라

	@Override
	public int select() {
		System.out.println("오라클 데이터 검색");
		return 1;
	}

	@Override
	public int insert(String strVal, int intVal) {
		System.out.println("오라클 데이터 저장");
		return 1;
	} 

}
