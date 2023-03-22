package edu.java.string;

public class StringMain {
	
	public static void main(String[] args) {
		// Ex 1. 아래의 주민번호 문자열에서 성별을 표시하는 위치의 문자만 출력.
		String ssn = "991231-1234567";
		System.out.println("sex: "+ ssn.charAt(7));
		System.out.println("sex: "+ssn.substring(7, 8));
		
		
		// Ex 2. 아래의 문자열 배열에서 "홍길동" 문자열이 처음 등장하는 인덱스를 출력
		// 만약에 "홍길동" 문자열이 배열에 없으면 -1을 출력
		System.out.println("\n2번 문제");
		String[] names = {"다한", "John", "Jane", "홍길동", "허균", "홍길동"};
		int index = -1;
		for (int i = 0; i < names.length; i++) {
		    if (names[i].equals("홍길동")) {
		    	
		        index = i;
		    }
		}
		System.out.println("인덱스: " + index);
//		int index = -1;
//		for(int i = 0; i < names.length; i++) {
//			if (names[i].equals("홍길동")) {
//				index = i;
//				System.out.println("홍길동"+index);
//				if (names[i].equals("홍길동")) {
//					continue;
//				}
//			} 
//		}
//		if (index == -1) {
//			System.out.println(index);
//		}
				
				
				
//				String x : names){
//			switch ("홍길동") {
//			case "홍길동":
//				System.out.println(names.length);
//				break;
//			if (x.equals("홍길동")) {
//				System.out.println(x.);
//				break;
//			} else {
//				System.out.println(-1);
//			}
//		}
		
		
		// Ex 3. 아래의 문자열 배열에서 5글자 이상인 문자열들을 찾아서 출력.
		System.out.println("\n3번 문제");
		String[] languages = {"Java", "SQL", "HTML", "CSS", "JavaScript", "Python"};
		for (String x : languages) {
			if (x.length() >=5) {
				System.out.println("5글자 이상인 문자열: "+x);
			}
		}
		
		// Ex 4. 아래의 문자열배열에서 대소문자 구별없이 "est"가 포함된 문자열들을 찾아서 출력.
		System.out.println("\n4번문제");
		String[] tests = {"TEST", "test", "TeSt", "tEST", "테스트"};
		for (String x : tests) {
			if (x.toLowerCase().indexOf("est") == 1) {
				System.out.println("ext가 포함된 문자열"+x);
			}
		}
		
		
		// Ex 5. 아래의 "YYYY-MM-DD" 형식의 날짜 문자열에서 연/월/일 정보를 int 타입 변수에 저장하고 출력
		System.out.println("\n5번문제");
		String date = "2023-03-22";
		int year;
		int month;
		int day;
		year = Integer.parseInt(date.substring(0, 4));
		System.out.println("year: "+year);
		month = Integer.parseInt(date.substring(5, 7));
		System.out.println("month: "+month);
		day= Integer.parseInt(date.substring(8, 10));
		System.out.println("day: "+day);
	}
}
