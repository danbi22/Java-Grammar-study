package edu.java.homework;

public class Three {
	public static void main(String[] args) {
		
		for(int i = 1; i<=100; i++) {
			int x = i % 10;  // 1의 자릿수
			int y = i / 10;  // 10의 자릿수
			
			
			if((x==3 || x==6 || x==9) || (y==3 || y==6 ||y==9)){
				System.out.print("*"+"\t");
			}else {
				System.out.print(i+"\t");
			}
			if(i%10==0) {
				System.out.println();
			}
		}
		
		System.out.println();
		
		for(int i = 1; i <= 100; i++) {
			
			int n1 = i % 10;  // n을 10으로 나눈 나머지 -> 1의 자릿수
			int n10 = i/10;  // 10의 자릿수
			// 숫자를 출력할 것인 지, "*"를 출력할 것인 지
			
			//1의 자리수가 3또는 6 또는 9인 경우
			boolean condition1 = (n1==3) || (n1==6) || (n1==9);
			
			// 10의 자리수가 3 또는 6또는 10인 경우
			boolean condition10 = (n10==3)  || (n10==6) || (n10==9);
			
			if (condition1 && condition10) {
				System.out.print("**\t");
			}else if(condition1 || condition10){
				System.out.print("*\t");
			}else {
				System.out.print(i+"\t");
			}
			
			if(i % 10 == 0) {
				System.out.println();
			}
		}
		
	}
}

