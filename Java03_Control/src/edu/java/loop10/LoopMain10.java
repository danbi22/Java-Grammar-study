package edu.java.loop10;

import java.util.Scanner;

public class LoopMain10 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		boolean run = true;  // 프로그램을 계속 실행할 지 , 종료할 지를 결정할 변수.
		int balance = 0;  // 은행 예금 잔고.
		Scanner scan =  new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3. 잔고 | 4.종료");
			System.out.println("----------------------------------------");
			System.out.print("선택> ");
			
			int menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				System.out.print("예금액> ");
				int money = scan.nextInt();
				balance += money;
				break;
			case 2:
				System.out.print("출금액> ");
				money = scan.nextInt();
				if(balance<money) {
					System.out.println("잔고가 부족합니다.");
				}else {
					balance -= money;
				}
				break;
			case 3:
				System.out.println("잔고> "+balance);
				break;
			case 4:
				run = false;
				break;
			default: // 예외 처리
				System.out.println("메뉴를 잘못 입력하였습니다. 다시 선택하세요.");
			}
			
		}
		System.out.print("\n프로그램 종료합니다.");
	}

}
