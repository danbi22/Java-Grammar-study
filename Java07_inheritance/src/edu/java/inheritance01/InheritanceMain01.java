package edu.java.inheritance01;

// 상속(inheritance): 상위 클래스를 확장해서 하위 클래스를 설계하는 것
// 상위 클래스의 멤버(필드, 생성자, 메서드)들을 하위 클래스에서 사용할 수 있음.
// 상위(super), 부모(parent), 기본(base) 클래스
// 하위(sub), 자식(child), 유도(derived) 클래스

public class InheritanceMain01 {
	
	public static void main(String[] args) {
		// BasicTv 타입의 객체 생성
		// 모든 클래스들은 object를 상속하고 있다.
		BasicTv tv1 = new BasicTv();
		tv1.printInfo();
		tv1.powerOnOff();
		tv1.printInfo();
		
		//SmartTv를 생성
		SmartTv tv2 = new SmartTv();
		tv2.powerOnOff(); // 상위 클래스의 메서드를 상속받아서 사용 가능.
		tv2.printInfo();
		tv2.setIp("192.168.31.1");
		System.out.println("IP: "+tv2.getIp());
		// 하위클래스는 상위클래스의 메서드도 사용할 수있고 자신이 만든 메서도도 만들 수 있다.
		// 다중상속: 상위클래스가 2개 이상인 것
		// 자바는 다중상속을 허용하지 않는다.
	}

}
