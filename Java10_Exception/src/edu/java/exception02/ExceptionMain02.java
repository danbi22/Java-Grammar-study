package edu.java.exception02;

import java.util.Scanner;

/*
 * try-catch 구문을 사용한 예외 처리:
 * 
 * try {
 *      (1) 실행할 코드들.
 * } catch (Exception 타입 변수 선언) {
 *      (2) 예외가 발생했을 때 실행할 코드
 * } finally {
 *      (3) 예외 발생 여부와 상관없이 항상 실행할 코드들.
 *      (try 불록이 모두 끝날을 때 또는 catch 블록이 모두 끝났을 때 실행할 코드들)
 * }
 * 
 * - 예외가 발생하지 않은 경우: (1) -> (3)
 * - 예외가 발생하는 경우: (1) 실행 중 예외 발생! -> (2) -> (3)
 * - 발생한 예외를 catch할 수 없으면 catch 블록이 실행되지 못하고 프로그램은 비정상적으로 종료됨.
 * - catch 블록은 발생할 수 있는 예외 종류에 따라서 여러개를 작성할 수도 있음.
 * - finally 블록은 선택 사항(필수가 아님).
 * 
 * 예외 클래스의 상속 관계:
 * Object
 * |__ Throwable
 * 			|__ Exception
 * 					|__RuntimeException, ...
 * 							|__ ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException
 * 
 * - catch 블록이 여러개일 떄는 하위 타입의 예외들을 먼저 catch 하고, 상위 타입의 예외들은 나중에 catch해야 함.
 */
public class ExceptionMain02 {
	
	public static void main(String[] args) {
		// 정수를 입력 받아서 나누기 결과를 출력
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("x를 입력하세요> ");
			int x = Integer.parseInt(sc.nextLine());
			
			System.out.print("y를 입력하세요> ");
			int y = Integer.parseInt(sc.nextLine());
			
			int result = x / y;
			System.out.println("x / y 몫= "+result);
		} catch (ArithmeticException e){
			System.out.println(e.getMessage());
			System.out.println("y는 0이 될 수 없습니다.");
		} catch (NumberFormatException n) {
			n.printStackTrace();
			System.out.println("정수를 입력해주세요.");
		} catch (RuntimeException r) {
			System.out.println("run");
		} catch (Exception e) { // Exception 클래스의 모든 하위 타입 예외들을 처리할 수 있음.
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료");
	}

}
