package edu.java.Wrapper;

import java.math.BigDecimal;

// Wrapper 클래스: 자바의 기본 타입의 값 하나를 저장하는(감싸는) 클래스
// 자바의 기본 타입: boolean, byte, short, int, long, char, float, double : 기능 없이 값만 저장
// -> 예약어로 되어있다. (소문자)
// wrapper 클래스 이름들: Boolean, Byte, Short, Integer, Long, Character, Float, Double
// wrapper 클래스들의 java.lang 패키지에 포함되어 있기 때문에 import 문장 생략
// wrapper 클래스 사용 목적:
// 1. 기본 데이터 타입의 값을 이용하는 메서드를 제공하기 위해서
// 2. 상속/다형성과 같은 객체지향 개념들을 이용하기 위해서
// 3. generic 클래스를 사용하기 위해서.
// 
public class WrapperMain {
	
	public static void main(String[] args) {
		int x = 1; // 기본타입(primitive type) - 메서드 없음.
		
		// Integer 타입의 객체를 생성 - 생성자는 권장하지 않고, static 메서드 사용을 권장
		// 생성자를 이용하는 것이 아닌 static메서드를 이용
		Integer number1 = Integer.valueOf(1); // int를 Integer 객체로 만들어준다.
		System.out.println(number1); // 1이 출력 Integer 클래스가 toString을 오버라이딩 하고있다.
		
		Integer number2 = Integer.valueOf("123"); // String을 Integer 객체로 만들어준다.
		System.out.println(number2);
		
//		number2. // 기본타입에서는 사용할 수 없던 메서드들을 사용할 수 있다.
		
		// auto-boxing(wrapping) : 기본타입 값을 wrapper 타입 객체로 자동 변환.
		Integer number3 = 1; // Integer.valueOf(1) 코드가 자동으로 실행.
		System.out.println(number3);
		
		int y = number3.intValue(); // unboxing: Integer 타입 객체에서 int 타입 값을 추출.
		System.out.println(y);
		
		// auto-unboxing: wrapper타입 객체가 자동으로 기본타입 값으로 변환.
		int z = number3; // number3.inValue() 코드가 자동으로 실행.
		
		Integer add = number1 + 2;
		System.out.println(add);
		
		Integer num = Integer.parseInt("123");
		System.out.println(num);
		
		Double.valueOf(50);
		
		Double.parseDouble("50");
		
		// float, double 타입은 소수점 이하의 오차가 생길 수 있음.
		double d1 = 1.1;
		double d2 = 0.9;
		System.out.println(d1-d2); // 1.1 - 0.9 = 0.2
		
		// 실수 타입의 오차를 원하는 수준까지 작게 줄여서 계산에 사용할 수 있는 클래스
		BigDecimal big1 = new BigDecimal("1.1");
		BigDecimal big2 = new BigDecimal("0.9");
		System.out.println(big1);
		System.out.println(big2);
		System.out.println(big1.subtract(big2));
		// BigDecimal 타입의 객체는 메서드를 호출해서 산술 연산(+, -, /, *)을 수행
		// BigDecimal 클래스 기본 타입의 wrapper 클래스가 아니기 때문에 auto-boxing/unboxing 기능이 없음
		
		
		
		
		
		
		
	}
}
