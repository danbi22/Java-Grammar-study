package edu.java.conditional03;

import java.util.Scanner;

public class ConditionalMain03 {

	public static void main(String[] args) {
		// 간단한 성적 처리 프로그램
		
		// 스캐너를 통해 (java, sql, html) 세가지 점수를 입력받는다
		// 세 과목의 총점을 계산하고 출력
		// 세 과목의 평균을 계산하고 출력
		// 입력된 점수를 90점은 A, 80점은 B, 70점은 C, 60점은 D, 그 이하는 F를 준다
		Scanner scan = new Scanner(System.in);  // 입력장치 Scanner를 사용할 준비 끝남.
		
		System.out.println("java 점수를 입력해주세요");
		int java = scan.nextInt();
		System.out.println("java 점수: "+java);
		
		System.out.println();
		
		System.out.println("sql 점수를 입력해주세요");
		int sql = scan.nextInt();
		System.out.println("sql점수: "+sql);
		
		System.out.println();
		
		System.out.println("html 점수를 입력해주세요");
		int html = scan.nextInt();
		System.out.println("html점수: "+html);
		
		System.out.println();
		
		int totalScore = java + sql + html;
		System.out.println("totalScore: "+totalScore);
		
		System.out.println();
		
		double average = totalScore/3.0;
		System.out.println("평균점수: "+average);
		
		System.out.println();
		
		System.out.println("학점기준:  90점 이상은 A입니다.");
		System.out.println("학점기준:  80점 이상은 B입니다.");
		System.out.println("학점기준:  70점 이상은 C입니다.");
		System.out.println("학점기준:  60점 이상은 D입니다.");
		System.out.println("학점기준:  60점 미만은 F입니다.");
		
		System.out.println();
		
		if(average >= 90) {
			System.out.println("학점은 A 입니다.");
		} else if(average >= 80) {
			System.out.println("학점은 B 입니다.");			
		} else if(average >= 70) {
			System.out.println("학점은 C 입니다.");
		} else if(average >= 60) { 
			System.out.println("학점은 D 입니다.");
		} else {
			System.out.println("학점은 F 입니다.");
		}

	}

}
