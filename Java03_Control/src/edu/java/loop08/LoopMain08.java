package edu.java.loop08;

public class LoopMain08 {

	public static void main(String[] args) {
		// 구구단 2단은 2x2 3단은 3x3까지 4단은 4x4까지... 9단은 9x9까지
		
		for(int a = 2; a<10; a++) {
			System.out.println("\n"+a+"단");
			
			for(int b = 1; b < 10; b++) {
				// 2x2, 3x3...9x9
				System.out.printf("%d x %d = %d\n", a, b, a*b);
				if(a==b) {
					break;
				} // end if
			} // end for (b)
		} // end for (a)
		
		System.out.println("\n-----------------\n");
		
		for(int x = 2; x<10; x++) {
			System.out.println("\n----"+x+"단----");
			
			for(int y = 1; y<=x; y++) {
				System.out.printf("%d x %d = %d\n", x, y, x*y);
			}
		}
		
		System.out.println("\n-----------------\n");
		
		// 중첩 while문을 사용해서 구구단 2단은 2x2 3단은 3x3까지 4단은 4x4까지... 9단은 9x9까지
		
		int a = 2;
		while(a<10) {
			System.out.println(a+"단");
			
			//구구단 
			int b = 1;
			while(b<=a) {
				System.out.printf("%d x %d = %d\n", a, b, a*b);
				
				//2단은 2x2 3단은 3x3까지 4단은 4x4까지... 9단은 9x9까지
				if(a==b) {
					break;
				}
				b++;
			}
			a++;
		}

	
		int x = 2;
		while(x<10) {
			System.out.println(x+"단");
			
			int y = 1;
			while(y<x) {
				System.out.printf("%d x %d = d%\n", x, y, x*y);
				y++;
			}
			x++;
		}
		
		
		
		
		
		
		
		
	}

}
