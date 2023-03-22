package edu.java.interface01;

// 인터페이스는 클래스를 상속할 수 없다.
// 인터페이스는 다른 팀 간의 약속
public interface DatabaseModule {
	// public static final 필드
	int DB_VERSION = 1; // public static final 생략  다른 패키지에서 보인다. 변경은 할 수 없다. 
	
	// public abstract 메서드
	/**
	 * 데이터베이스 테이블에서 자료를 읽어서 검색하는 기능.
	 * 
	 * @return 검색된 자료의 개수(int)
	 */
	int select(); // public abstract 생략 // 바디가 없다. abstract가 생략되었다. 그럼에도 오류가 발생하지 않았다. 이것이 인터페이스의 특징 abstract를 써도문제는 없다.
	// 인터페이스의 목적이 public abstract인 것을 만들자 이어서 생략하기로 함.
	
	/**
	 * 데이터베이스 테이블에 자료들을 저장하는 기능.(이 있었으면 좋겠다. 라는 회의가 팀장들 간에서 나옴)
	 * 어떤 클래스, 기본타입으로 넘겨주어야 할까?
	 * @param strVal 저장할 문자열
	 * @param intVal 저장할 정수.
	 * @return 테이블에 저장된 행(raw)의 개수(int)
	 */
	int insert(String strVal, int intVal); // 여기까지 만드는 것이 인터페이스. 이렇게 만들자는 약속을 해놓은 것이다. 
}
