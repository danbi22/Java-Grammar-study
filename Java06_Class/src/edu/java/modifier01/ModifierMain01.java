package edu.java.modifier01;

public class ModifierMain01 {
	//not visible: 수식어가 없는 경우 다른 패키지에서는 보이지 않는다.
	// public으로 공개된 메서드는 어디서든지 사용 가능.
	public static void main(String[] args) {
		
		// 같은 패키지에 있는 클래스 타입은 import 문장 없이 사용 가능.
		AccessTest test = new AccessTest(1, 2, 3, 4);
//		System.out.println(test.a);  // not visible: private
		System.out.println(test.b); // 수식어가 없는 경우 같은 패키지 범위에서는 보임.
		test.printInfo();
		
		//test.a =100;  not visible
		test.d = 100;
		test.printInfo();
		
		// 생성자를 private로 선언하면 다른 클ㄹ래스에서는 생성자를 호출할 수 없기 때문에
		// 객체를 생성할 수 없음.
		// new Math();  // JDK jav.lang.Math 클래스의 생성자는 private -> 객체 생성 불가능
		
	}

}
