package edu.java.loop04;

public class Tree {
	
	public static void main(String[] args) {
		
		for(int i = 1; i<=100; i++) {
			
			int x = i%10;
			int y = i/10;
			
			if((x==3 || x==6 || x==9) || (y==3 || y==6 || y==9)) {
				System.out.print("*\t");
			}else {
				System.out.print(i+"\t");
			}
			if(i%10==0) {
				System.out.println();
			}
		}
	}

}
