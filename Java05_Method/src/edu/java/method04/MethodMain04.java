package edu.java.method04;

public class MethodMain04 {

	public static void main(String[] args) {
		// 메서드 오버로딩(method overloading):
		// 같은 이름의 메서드를 여러개 정의하는 것.
		// println()은 한개가 아니다 이름은 같지만 기능이 다 다르다
		// 메서드의 파라미터의 타입 또는 개수가 다를 때 overloading 할 수 있음.
		// (주의) 메서드의 파라미터는 같고 return 타입만 다르게 overloading 할 수 없음.
		// 
		System.out.println("안녕하세요");
		System.out.println();
		System.out.println(10);
		System.out.println(3.14);
		System.out.println(true);
		
		System.out.println(divide(10, 4));
		System.out.println(divide(10.0, 4.0));
	}
	
//	public static double divide(int x, int y) {
//		return (double) x / y;
//	}
	// 리턴 타입이 다르다고해서 overloading할 수 있는 것은 아님
	
	/**
	 * x를 y로 나눈 몫을 리턴
	 * @param x 
	 * @param y
	 * @return
	 */
	public static int divide(int x, int y) {
		return x / y;
	}
	/**
	 * (소수점 포함) 나누기 결과를 리턴
	 * @param x
	 * @param y
	 * @return
	 */
	public static double divide(double x, double y) {
		return x / y;
	}

}
