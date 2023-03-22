package edu.java.date;

// java.lang.String, java.lang.System, ... -> import 문장 생략
import java.time.LocalDate;

public class DateMain {
	
	public static void main(String[] args) {
		// Java 8 버전에서 새로 추가된 날짜/시간 관련 클래스와 메서드
		LocalDate now = LocalDate.now(); // LocalDate 클래스의 static 메서드 호출.  // 클래스이름을 통해 사용할 수 있는 메서드: static 메서드
		System.out.println(now); // LocalDate 클래스는 toString()메서드를 override.
		System.out.println(now.getYear()); // 참조변수를 통해 사용할 수 있는 메서드: instance 메서드
		System.out.println(now.getMonth()); // java.time.Month enum 상수를 리턴.
		System.out.println(now.getMonthValue()); // 월을 숫자(int)로 리턴.
		System.out.println(now.getDayOfWeek()); // java.time.DayOfWeek enum 상수를 리턴.
		System.out.println(now.plusDays(7)); // 오늘 날짜에서 7일을 더 함
		System.out.println(now.plusWeeks(2)); // 오늘 날짜에서 2주일을 더 함.
		
		LocalDate date = LocalDate.of(2023, 2, 28);
		
		
		
		
	}
}
