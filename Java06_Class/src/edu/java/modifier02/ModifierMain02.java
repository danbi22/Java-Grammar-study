package edu.java.modifier02;

import edu.java.modifier01.AccessTest;
/*
 * 1. 같은 패키지에 있는 클래스는 import 선언문 없이 변수 선언에서 사용할 수 있음.
 * 2. 다른 패키지에 있는 클래스는:
 *  (1) import 선언문을 작성하고 변수 선언에서 사용할 수 있음.
 *  (2) import 선언문 없이.  패키지 이름을 포함한 클래스 전체 이름(full name)을 변수 선언과 생성자 호출에서 사용.
 *  	각각 다른 패키지에 같은 이름의 클래스가 존재할 경우 사용 ex) a.test, b.test  하나는 import 하나는 패키지 이름을 작성
 *  현업에서 패키지 이름을 짓는 관습: 회사 도메인을 거꾸로 붙여넣는다. com.naver.ClassName
 *  3. JDK의 패키지 중에서 java.lang 패키지의 클래스들은 import 선언문 없이 클래스 이름을 사용. lang은 language
 *   (ex) String, System, Math, ...
 *   패키지 이름을 회사 도메인(naver.com, kakao.com, google.com)을 이용하는 이유는 클래스 이름이 같더라도 다른 패키지 이름으로 구별할 수 있도록 하기 위해서. 
 */

public class ModifierMain02 {
	String s;	
	public static void main(String[] args) {
		
		// (2) edu.java.modifier01.AccessTest test = new edu.java.modifier01.AccessTest(1, 2, 3, 4);
		AccessTest test = new AccessTest(1, 2, 3, 4);
		// ctrl+shift+o: import 선언문 최적화(optimize)
		// - 필요한 import 문은 자동으로 작성, 필요 없는 import 문은 자동으로 삭제
		
		// test.c = 100; // not visible
		test.printInfo();
		
		
	}

}
