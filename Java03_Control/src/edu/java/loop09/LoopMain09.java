package edu.java.loop09;

import java.util.Random;

public class LoopMain09 {

    public static void main(String[] args) {
        /* 문제 1. 아래와 같이 출력하세요.
           *
           **
           ***
           ****
           *****
         */
        
    	for(int a = 1;a<6; a++) {
    		if(a==1) {
    			System.out.println("*");
    		}else if(a==2) {
    			System.out.println("**");
    		}else if(a==3) {
    			System.out.println("***");
    		}else if(a==4) {
    			System.out.println("****");
    		}else if(a==5) {
    			System.out.println("*****");
    		}
    	}
    	
    	System.out.println("\n---------------\n");
    	
        /* 문제 2. 아래와 같이 출력하세요.
           *
           **
           ***
           ****
           *****
           ****
           ***
           **
           *
         */
    	
    	for(int a = 1;a<6; a++) {
    		if(a==1) {
    			System.out.println("*");
    		}else if(a==2) {
    			System.out.println("**");
    		}else if(a==3) {
    			System.out.println("***");
    		}else if(a==4) {
    			System.out.println("****");
    		}else if(a==5) {
    			System.out.println("*****");
    		}
    	}
    	for(int a=4; a>0; a--) {
    		if(a==1) {
    			System.out.println("*");
    		}else if(a==2) {
    			System.out.println("**");
    		}else if(a==3) {
    			System.out.println("***");
    		}else if(a==4) {
    			System.out.println("****");
    		}else if(a==5) {
    			System.out.println("*****");
    		}
    	}
    	
    	
        /* 문제 3. 주사위 2개를 던졌을 때 나오는 주사위 눈을 (x, y) 형식으로 출력하세요.
           두 눈의 합이 5가 되면 출력을 멈추세요.
           힌트1: Random 타입의 nextInt(start, end) 메서드를 사용.
           힌트2: 무한루프: for(;가운데가 비여있으면;){...}    while(true){...}
           출력 결과 예시:
           (2, 4)
           (6, 1)
           (3, 3)
           (4, 1)
         */
    	
    	Random random = new Random();
    	
    	int a = random.nextInt(1,7);
    	int b = random.nextInt(1,7);
    	
    	for(;;) {
    		System.out.printf("(%d, %d)\n",a, b);
    		if(a+b==5) {
    			break;
    		}
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }

}