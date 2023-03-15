package edu.java.array05;

import java.util.Random;

public class ArrayMain05 {
	
	public static void main(String[] args) {
		
		// int 10개를 저장할 수 있는 배열을 선언. v	
		// 배열에 난수(0,1) 10개를 저장 v
		// 배열의 내용을 출력 v
		// 문자열 10개를 저장할 수 있는 배열(genders)을 선언 v
		// genderCodes의 값이 0이면 "Male", 1이면 "Female"을 문자열 배열에 저장 v
		// 문자열 배열 genders의 내용을 출력 v
		// 문자열 배열에 저장된 "male"의 개수, "Female"의 개수를 출력
		// 숫자 x, y가 같은 지 비교: x == y
		// 문자 i, j가 같은 지 비교: i.equals(j)
		Random random = new Random();  // 난수를 생성하는 객체를 생성해서 변수 random에 저장
		int count = 10; // 배열의 길이(원소 개수)가 변할 때 용이하기위해 count변수 선언
		String male = "Male"; // "Male"을 반복해서 입력하면 오타가 날 수 있고 "남성"등 문자열 변경을 용이하기 위해 변수로 만듬
		String female = "Female";
		int[] genderCodes = new int[10]; // int 타입 배열의 genderCodes라는 변수선언 후 int타입 길이가 10인 배열을 저장 
		for(int i = 0; i < count; i++) { // 각 배열을 호출하기 위한 반복문   
			genderCodes[i] = random.nextInt(2);  // 각 배열에 0이상 2미만의 난수를 저장
		}
		for(int x : genderCodes) { // genderCodes의 값들을 불러와 x에 저장하는 for-each문
			System.out.print(x+" "); // genderCodes의 값들과 한칸 뛰고 출력 
		}
		
		System.out.println();
		
		String[] genders = new String[10]; // String 타입 배열의 genders변수 선언, 10개의 값이 들어갈 String배열을 생성 
		for(int i = 0; i < count; i++) { // genderCodes[i]의 값과 genders[i]를 동시에 사용하기위해 반복문생성
			if(genderCodes[i] == 0) {  // genderCodes[i]의 값이 0이면
				genders[i] = male;  // genders[i]에 "Male" 저장
			}else {  // gendersCodes[i]의 값이 0이 아니면
				genders[i] = female;  // genders[i]에 "Female" 저장
			}
		}
		for(String x : genders) { // genders 배열의 값을 String 타입 변수 x에 저장하는 for-each문 생성 
			System.out.println(x); // genders 배열의 값을 반복해서 출력
		}
		
		int NumberOfMale = 0;  // Male의 수를 세서 저장하기 위한 int형 변수 male 생성
		int NumberOfFemale = 0; // Female의 수를 세서 저장하기 위한 int형 변수 female생성
		for(int i = 0; i < count; i++) { // genders[i] 값들을 불러오기 위해 반복문 생성
			if (genders[i].equals(male)) { // genders[i]가 "Male"과 같은지 비교
				NumberOfMale++; // genders[i]가 0이라면 male변수에 1을 더한다.
			}else { // genders[i]의 값이 "Male"이 아니라면
				NumberOfFemale++; // female에 1을 더함
			}	
		}
		System.out.println("남성의 수 : "+NumberOfMale);  // "Male"의 갯수를 출력
		System.out.println("여성의 수 : "+NumberOfFemale);  // "Female"의 갯수를 출력
	}
}
