package edu.java.modifier05;

import edu.java.modifier04.PublicClass;
// import edu.java.modifier04.PackageClass;  not visible

/*
 *  클래스 접근 수식어(access modifier)
 *  1. public: 어디서나 사용할 수 있는 클래스
 *  2. (package): 수식어가 없는 경우. 같은 패키지의 클래스들에서만 사용 가능한 클래스.
 *  (주의) public 클래스의 이름은 java 파일의 이름과 같아야 함. 에러남
 *  package 클래스의 이름은 java 파일의 이름과 달라도 에러가 나지 않음.
 *  1개의 java 파일에 2개의 public  클래스를 정의할 수 없다.
 */

//public class A {}  문법오류

class B {} // 가능 왠만하면 클래스 별로 java 파일을 만들어라. 문법적으로 허용하지만 좋은 코딩은 아니다. 

public class ModifierMain05 {

	public static void main(String[] args) {
		// edu.java.modifier04.PublicClass 타입의 객체 생성.
		PublicClass cls = new PublicClass();
		
//		edu.java.modifier04.packageClass cls2;  not visible
		

	}

}
