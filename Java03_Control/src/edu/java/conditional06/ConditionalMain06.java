package edu.java.conditional06;

import java.util.Random;

public class ConditionalMain06 {
	
	public static void main(String[] args) {
		// Random타입의 변수를 선언하고 초기화.
		// java 과목 점수를 난수(0~100)로 만들어서 저장
		// SQL 과목 점수를 난수(0~100)로 만들어서 저장
		// HTML 과목 점수를 난수(0~100)로 만들어서 저장
		// 합격 / 불합격 여부를 출력
		// 합격 조건: 세 과목의 점수가 모두 40점 이상이고, 세 과목의 평균이 60점 이상.
		
		Random r = new Random();
		int javaScore = r.nextInt(101);
			System.out.println("javaScore: "+javaScore);
		int SQLScore = r.nextInt(101);
			System.out.println("SQLScore: "+SQLScore);
		int HTMLScore = r.nextInt(101);
			System.out.println("HTMLScore: "+HTMLScore);
		
		System.out.println();
		
		double average = (javaScore+SQLScore+HTMLScore)/3.0;
			System.out.println("average: "+average);
		
		System.out.println();
		
//		if(javaScore>=40) {
//			if(SQLScore>=40) {
//				if(HTMLScore>=40) {
//					if(average>=60) {
//						System.out.println("합격");
//					}else {
//						System.out.println("불합격");
//					}
//				}else {
//					System.out.println("불합격");
//				}	
//			}else {
//				System.out.println("불합격");
//			}	
//		}else {
//			System.out.println("불합격");
//		}
		
		
		System.out.println();
		String result = (javaScore>=40 && SQLScore>=40 && HTMLScore>=40 && average>=60) ? "합격" : "불합격";
		System.out.println(result);
		
		
		if(javaScore>=40 && SQLScore>=40 && HTMLScore>=40 && average>=60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	}
}

