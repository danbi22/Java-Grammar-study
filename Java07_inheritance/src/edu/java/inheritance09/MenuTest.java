package edu.java.inheritance09;

import java.util.Scanner;

enum Menu {
	// enum 상수 선언(public static final Menu 타입 변수) 선언
	QUIT, CREATE, READ_ALL, READ_BY_INDEX, UPDATE, DELETE, UNKNOWN;
	
	/**
	 * 정수가 입력되면, 그 정수에 해당하는 열거형 상수를 리턴.
	 * 0-> QUIT, 1 -> CREATE, 2 -> READ_ALL, 3 -> READ_BY_INDEX, 4 -> UPDATE, 5 -> DELETE,
	 * 그 이외의 정수들인 경우에는 UNKNOWN을 리턴
	 * @param n 정수 (int)
	 * @return Menu 타입의 열거형 상수.
	 */
	public static Menu getValue(int n) {
		Menu[] menu = Menu.values(); // 모든 enum객체는 Enum의 메서드를 가지고있다.
//		int len = menu.length; // menu도 배열이기 때문에 length를 사용할 수 있다.
//		if (n >= 0 && n < len) {
//			return menu[n];
//		} else {
//			return menu[len - 1];
//		}
		if (n < 0 || n >= 7) {
			n=6;
		}	
		return menu[n];
	}
	// values() 열거형 배열을 만들어줌
	// 우리는 Menu안에서 values()를 만들지 않았는데 사용이 가능하다? 어떻게 사용할 수 있었나
	// Enum 클래스에서 작성된 메서드이고 enum은 Enum을 상속한다. 그렇기 때문에 사용할 수 있다. (static)이기 때문에 볼 수 있다.
}

public class MenuTest {
	
	public static void main(String[] args) {
		Singleton s = Singleton.INSTANCE; // 싱글톤이라고 만들어진 객체는 INSTANCE한개 밖에 없다.
		// enum 타입이 열거형 상수 1개만 가지고 있으면,
		// 그 enum 타입에 할당할 수 있는 객체는 1개 밖에 있게 됨.
		// 싱글톤 객체
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력> ");
		int n = Integer.parseInt(sc.nextLine());
		
		// Menu m = Menu.CREATE;
		Menu menu = Menu.getValue(n); // 정수(int)를 전달하면 Menu의 상수들 중 하나를 리턴.
		switch (menu) {
        case QUIT:
            System.out.println(menu.name());
            break;
        case CREATE:
            System.out.println(menu.name());
            break;
        case READ_ALL:
            System.out.println(menu.name());
            break;
        case READ_BY_INDEX:
            System.out.println(menu.name());
            break;
        case UPDATE:
            System.out.println(menu.name());
            break;
        case DELETE:
            System.out.println(menu.name());
            break;
        case UNKNOWN:
            System.out.println(menu.name());
            break;
        }
	}

}
