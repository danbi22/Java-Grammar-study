package edu.java.exception03;

public class ExceptionMain03 {
	
	public static void main(String[] args) {
		// finally 블록: 예외 발생 여부와 상관없이 "반드시" 마지막에 실행.
		// try 블록이 정상적으로 모두 실행이 끝난 후
		// 또는 예외가 발생해서 catch 불록의 실행이 끝난 후에 finally 블록이 실행됨.
		// (주의) try 블록 또는 catch 블록 안에 return 문장이 있는 경우에도
		// finally 블록을 실행한 후에 return 문장이 실행됨.
		
		try { //(1)
			int x = 100;
			int y = 0;
			System.out.println("몫 = " + (x/y));
			System.out.println("---try 블록 끝---");
			
		} catch (ArithmeticException e) { //(2)
			System.out.println("0으로 나눌 수 없음");
			System.out.println("---catch블록 끝---");
			return; // void메서드는 return을 만나면 메서드가 종료된다. try-catch-finally문에서는 return을 만나더라도 finally는 반드시 실행된 후 종료된다.
			
		} finally { //(3)
			System.out.println("언제 실행 될까요?");
		}
		System.out.println("--- main method 종료---"); //(4)
	}

}
