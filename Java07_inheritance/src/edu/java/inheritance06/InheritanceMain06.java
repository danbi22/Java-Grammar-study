package edu.java.inheritance06;

class T{
	@Override // java.lang.Object 클래스에서 상속한 toString 메서드를 override
	public String toString() {
		// 객체를 문자열로 (to String) 변환해서 리턴.
		return "T 타입 인스턴스";
	}
}

public class InheritanceMain06 {
	
	public static void main(String[] args) {
		// java.lang.Object 클래스: 자바의 최상위 클래스.
		// 자바의 모든 클래서는 Object의 protected 또는 public 멤버(메서드)를 상속받아서
		// 사용 가능하고, 재정의(override)할 수 있음.
		// Object 클래스의 메서드 재정의: toString, equals, hashCode, ... 
		
		//System.out.println(Object x):
		// argument로 전달된 객체의 toString() 메서드가 리턴하는 문자열을 콘솔창에 출력.
		// 클래스를 정의할 때, toString() 메서드를 override해서 원하는 문자열이 출력될 수 있도록 할 수 있다.
		T t = new T();
		System.out.println(t);
		
		Point pt1 = new Point();
		System.out.println("pt1: "+pt1); // 오브젝트가 전달이 되면 toString메서드를 호출 
		// Point 클래스에서 toString() 메서드를 override하지 않으면,
		// Object 클래스에서 상속받은 toString() 메서드가 리턴하는 문자열을 콘솔창에 출력.
		// Point 클래스에서 toString() 메서드를 override(재정의)하면,
		// println은 Point 클래스에서 재정의된 toString 메서드가 리턴하는 문자열을 콘솔창에 출력
		
		Point pt2 = new Point(0, 0);
		System.out.println("pt2: "+pt2);
	
		
		System.out.println("==연산자: "+(pt1 == pt2));
		// -> == 연산자는 지역변수 pt1의 값과 pt2의 값을 비교
		// 클래스 타입의 지역 변수가 저장하는 값은 객체가 생성된 힙(heap)공간의 주소 
		System.out.println("equals 메서드: "+pt1.equals(pt2)); // 두개의 객체가 같은지 다른지 재정의하기 위한 메서드
		// -> equals() 메서드를 override하면, 두 객체가 같은지 에 대한 정의를 새로 내일ㄹ 수 있음
		// ==는 클래스타입의 경우 참조변수의 주소값을 비교
		// equals는 객체를 비교
		
		System.out.println("pt1 hashCode: "+ pt1.hashCode());
		System.out.println("pt2 hashCode: "+ pt2.hashCode());
		// -> equals가 true를 리턴하는 두 객체(pt1, pt2)는 hashCode() 리턴 값이 같다.
		
		System.out.println();
		String s1 = new String("안녕하세요");
		String s2 = new String("안녕하세요");
		System.out.println("==연산자: "+(s1 == s2));
		// -> 두 문자열이 생성된 주소 값들을 비교
		System.out.println("equals 메서드: "+s1.equals(s2));
		// -> java.lang.String 클래스는 equals()를 override(재정의)하고 있음.
		// -> 문자열의 내용이 같은 지를 비교하도록 재정의
		
		
		System.out.println("========================================");
		
		User u1 = new User("dbekgks", "123");
		User u2 = new User("dbekgks", "456");
		
		System.out.println("User 메서드: "+u1.equals(u2));
		System.out.println("u1 hashCode: "+u1.hashCode());
		System.out.println("u2 hashCode: "+u2.hashCode());
		
		
		
		
		
		
		
		
	}
	

}
