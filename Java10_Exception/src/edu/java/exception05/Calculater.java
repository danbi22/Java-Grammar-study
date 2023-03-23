package edu.java.exception05;

public class Calculater {
	
	public int divide(int x, int y) throws Exception {
		if(y != 0) {
			return x / y;
			// return문은 메서드를 종료하고 값을 메서드 호출한 곳에 반환.
		}
		throw new Exception("y는 0이 될 수 없음.");
		// throw: 메서드를 호출한 곳으로 예외 객체를 던짐.
	}
}
