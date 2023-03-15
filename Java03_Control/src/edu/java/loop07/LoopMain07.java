package edu.java.loop07;

public class LoopMain07 {

	public static void main(String[] args) {
		// 2단부터 9단까지 구구단 만들기
		// 2중 반복문
		
//		for(int a = 2; a<10; a++) {
//			System.out.println(a+"단");
//			for(int b = 1; b<10; b++) {
//				System.out.printf("%d X %d = %d\n", a, b, a*b);
//			}
//			System.out.println();
//		}
//		System.out.println("\n=============\n");
		
		
//		do {
//			System.out.println(a+"단");
//			
//		}while(a<10); {
//			while(b<10) {
//			System.out.printf("%d X %d = %d\n", a, b, a*b);
//			b++;
//			}
//		a++;
//			
//		}
//
//			
		
		int a = 2;
		while(a<10){
			System.out.printf("\n%d 단\n", a);
				
				int b =1;
				while(b<10) {
					System.out.printf("%d X %d = %d\n", a, b, a*b);
					b++;
					
			}
				a++;
		}		
		
		int x =2;
		while(x<10) {
			System.out.println("\n----"+x+"단----");
				
				int y = 1;
				while(y<10) {
					System.out.printf("%d x %d = %d\n", x, y, x*y);
					y++;
				}
					
				x++;
		}
		
		
	}

}
