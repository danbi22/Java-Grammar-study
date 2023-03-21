package edu.java.inheritance09;

// enum:
// (1) 열거형 상수(들)을 정의하는 특별한 종류의 클래스.
// (2) java.lang.Enum 클래스를 상속하는 특별한(직접상속할 수 없음) 하위 클래스.
// (3) field, 생성자, 메서드를 선언(정의)할 수 있음.

class Test {
	public static final Test AM = new Test("오전");
	public static final Test PM = new Test("오후");
	
	private String meaning;
	
	private Test(String meaning) {
		this.meaning = meaning;
	}
}
// Time타입의 객체
enum Time{ // 클래스의 한종류 수식어를 붙일 수 있다.
	AM("오전"), PM("오후"); // 선언된 enum에는 순서가 있다 첫번째 부터 0으로 시작한다. ex) AM: 0, PM: 1
	
	// field
	private String meaning;
	
	// constract - enum의 생성자는 반드시 private
	private Time(String meaning) {
		this.meaning  = meaning;
	}
	
	// 메서드
	public String getMeaning() {
		return this.meaning;
	}
}
public class EnumTestMain {
	
	public static void main(String[] args) {
	
		Time t = Time.PM;
		System.out.println(t); // am.toString()의 리턴 값을 출력
		System.out.println(t.name()); // toString의 다른 메서드 // Enum 클래스에서 상속받은 메서드
		System.out.println(t.ordinal()); // "
		System.out.println(Time.values()); // Enum 클래스에서 상속받은 static 메서드
		Time[] times = Time.values(); 
		for (Time x : times) {
			System.out.println(x + ":" + x.getMeaning());
		}
		
	}

}
