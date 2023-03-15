package edu.java.homework;

import java.util.Random;
import java.util.Scanner;

public class Homework01 {

    public static void main(String[] args) {
        // 가위바위보 게임
        // 가위-0, 바위-1, 보-2

        // 컴퓨터의 가위/바위/보는 (정수) 난수로 만듦.
        Random random = new Random();
        int computer = random.nextInt(3);

        // 사용자는 콘솔창에서 키보드로 가위/바위/보에 해당하는 정수를 입력.
        System.out.println("가위/바위/보 게임");
        System.out.println("-----------------");
        System.out.println("[0] 가위");
        System.out.println("[1] 바위");
        System.out.println("[2] 보");
        System.out.println("-----------------");
        System.out.print("선택>>>");

        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();

        // print(computer : user)
        System.out.println("computer(" + computer + ") : user(" + user + ")");
        
        System.out.println();

        // TODO: 누가 이겼는 지 결과를 출력하세요.
        String win = "이겼다.";
        String lose = "졌다.";
        String draw = "비겼다.";
        
        if(computer==0 && user ==0) {
        	System.out.println(draw);
        }else if(computer==0 && user==1){
        	System.out.println(win);
        }else if(computer==0 && user==2){
        	System.out.println(lose);
        }else if(computer==1 && user==0){
        	System.out.println(lose);
        }else if(computer==1 && user==1){
        	System.out.println(draw);
        }else if(computer==1 && user==2){
        	System.out.println(win);
        }else if(computer==2 && user==0){
        	System.out.println(win);
        }else if(computer==2 && user==1){
        	System.out.println(lose);
        }else if(computer==2 && user==2){
        	System.out.println(draw);
        }	
        	
        System.out.println();
        
        if (user == 0) {
        	if(computer==0) {
        		System.out.println(draw);
        	} else if(computer==1) {
        		System.out.println(lose);
        	} else {
          		System.out.println(win);
          	}
        } else if(user == 1) {
        	if(computer==0) {
        		System.out.println(win);
        	} else if(computer==1) {
        		System.out.println(draw);
        	} else {
        		System.out.println(lose);
          	}
        } else {
        	if(computer==0) {
        		System.out.println(lose);
        	} else if(computer==1) {
        		System.out.println(win);
        	} else {
        		System.out.println(draw);
          	}
        }
        
        System.out.println();
        
        
        // 방법 3:
        if (user  == computer) { // 비기는 경우
        	System.out.println(draw);
        } else if (user==0) {  // 비기지 않았는데 사용자가 가위를 낸 경우
        	if(computer==1) {  // 사용자가 0을 냈기 때문에 비기는 경우의 수는 위에서 한번만 이루어짐
        		System.out.println(lose);
        	} else {
        		System.out.println(win);
        	}
        } else if (user==1) {  // 비기지 않았는데 사용자가 바위를 낸 경우
        	if (computer==0) {
        		System.out.println(win);
        	} else {
        		System.out.println(lose);
        	}
        } else {  // 비기지 않았는데 사용자가 보를 낸 경우
        	if(computer==0) {
        		System.out.println(lose);
        	}else {
        		System.out.println(win);
        	}
        }
        
        System.out.println();
        
        // 방법 4:
        if (user ==computer) { // 비긴 경우
        	System.out.println(draw);
        } else if ((user==0 && computer ==2) || (user==1 && computer ==0) || (user==2 && computer ==1)){  // 사용자가 이긴 경우
        	System.out.println(win);
        } else { // 사용자가 진 경우
        	System.out.println(lose);
        }
        
        System.out.println();
        
        // 방법 5:
        int diff = user - computer;
        if(diff==0) {
        	System.out.println(draw);
        }else if(diff == -2 || diff == 1 || diff == -2 ){
        	System.out.println(win);
        }else {
        	System.out.println(lose);
        }
        
    }

}