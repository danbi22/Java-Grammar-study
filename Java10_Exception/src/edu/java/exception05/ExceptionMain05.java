package edu.java.exception05;

/*
 * Java의 예외(Exception) 클래스
 * 1. unchecked Exception: 
 * 		- 예외 처리를 하지 않아도(try-catch 문장을 사용하지 않아도) 컴파일 에러가 발생하지 않는 예외 클래스 체크하지 않아도 괜찮은 Exception
 * 		- RuntimeException의 하위 클래스들.
 * 		- (예) NumberFomatException, NullPointerException, ...
 * 
 * 2. checked exception
 * 		- 반드시 예외 처리를 해야만 하는 예외 클래스들
 * 		- try-catch 문장을 사용하지 않거나 throws 선언문을 사용하지 않으면 컴파일 에러가 발생하는 예외 클래스들.
 * 		- RuntimeException의 하위 클래스가 아닌 Exception 하위 클래스들.
 * 		- (예) Exception, IOException, FileNotFoundException, ...
 */

public class ExceptionMain05 {
	
	public static void main(String[] args) {
		Calculater calc = new Calculater();
		
		int result;
		try {
			result = calc.divide(5, 0);
			System.out.println("몫 = "+result);
		} catch (Exception e) {
			e.printStackTrace(); // 예외 종류, 메시지, 발생 위치를 프린트.
		}
		
	}

}