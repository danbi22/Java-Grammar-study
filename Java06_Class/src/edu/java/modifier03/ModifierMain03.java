package edu.java.modifier03;

/*
 * 데이터 캡슐화(encapsulation):
 * 객체의 필드(멤버 변수)들은 private로 선언해서 클래스 외부에서 보이지 않도록 감추고, 
 * 대신에, 필요한 경우에 한해서 public으로 공개된 메서드를 제공함으로써 
 * 간접적으로 필드의 값을 읽거나 수정할 수 있도록 허용하는 프로그래밍 방법.
 * getter 메서드: 얻어오다, 가져오다. 필드의 값을 리턴하는 메서드.
 * - getter 메서드의 이름은 보통 필드 이름 앞에 get을 붙여서 만듦
 * - boolean 타입 필드의 getter 메서드는 get 또는 is를 붙여서 만듦
 * setter 메서드: 설정하다. 설정해주는 사람. 필드의 값을 변경하는 메서드
 * - setter 메서드의 이름은 보통 필드 이름 앞에 set을 붙여서 만듦
 * 데이터 캡슐화를 사용하는 이유는 데이터의 보안과 무결성을 유지하기 위해서이다.
 * 보안: 보이지 않으니 사용할 수 없다. 변경할 수 없다.
 * 무결성: 사람 클래스 사람이 가진 속성 나이 키 몸무게 등등 나이는 int 자바의 정수는 음수가 저장될 수 있음. 사람의 나이는 음수가 없다. 필드를 퍼블릭으로 공개 값이 변경가능해짐 나이는 절대로 0이 될 수 없다. 무결성 0 혹은 음수로 변했다는
 * 무결성이 깨졌다는 의미이다. 
 */

public class ModifierMain03 {
	
	public static void main(String[] args) {
		// Person 타입의 객체 생성
		Person p1 = new Person("유다한", 26);
//		p1.age = -16; // 필드 값 변경  // 필드 값을 직접변경할 시 메서드의 오류가 생길 수 있고 이것을 무결성이 깨졌다고 표현한다. 
//		System.out.println(p1.age); // 필드 값 읽기
		
		// private로 감춰진 필드의 값 읽기 -> public으로 공개된 getter 메서드 사용
		System.out.println("이름: " + p1.getName());
		System.out.println("나이: " + p1.getAge());
		
		p1.setAge(17);
		System.out.println("나이: "+p1.getAge());
		
		System.out.println("\n======================\n");
		
		// 스캐너를 이용한 유저 만들기
	
		
		User user = new User(1, "dbekgks", "hello");
		
		user.setuserNo(2020);
		System.out.println(user.getuserNo());
		
		user.setuserId("유다한");
		System.out.println(user.getuserId());
		
		user.setpassword("2023");
		System.out.println(user.getpassword());
		
		
		
	}
}
