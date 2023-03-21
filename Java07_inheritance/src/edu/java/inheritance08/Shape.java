package edu.java.inheritance08;

// abstract는 하위클래스들이 상속받아서 사용해야하기 떄문에 final을 붙일 수 없다. fanal을 붙이는 순간 상속할 수 없는 클래스가 되어 버리기 때문이다.

public abstract class Shape { // abstract 생성자가 있으나 호출 불가
	// field
	protected String type;
	
	// constructor // 추상클래스의 생성자는 하위 클래스에서만 호출할 수 있다.
	protected Shape(String type) {
		this.type = type;
	}
	
	// method
	// 추상 메서드
	public abstract double area(); // 도형의 넓이를 리턴
	public abstract double perimeter(); // 도형의 둘레 길이를 리턴.
	// 서로 다르지만 모든 도형은 넓이를 가져야하고 둘레를 가져야한다.
	
	// 일반 메서드를 만들 수 없는 것은 아니다.
	// final 메서드 - 하위 클래스에서 override(재정의)하지 못하도록 하기 위해서.
	public final void draw() {
		String info = String.format("%s: 넓이=%.1f, 둘레=%.1f", this.type, area(), perimeter());
		System.out.println(info);
	}
}
