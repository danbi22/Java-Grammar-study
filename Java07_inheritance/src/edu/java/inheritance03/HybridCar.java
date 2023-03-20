package edu.java.inheritance03;

// 하이브리드 자동차는 자동차이다.(IS-A 관계)
public class HybridCar extends Car{
	// field
	private int battery;
	
	// constructor
	public HybridCar(double fuel, double speed, int battery) {
		super(fuel, speed);
		// 상위 클래스에 기본 생성자가 없기 때문에, 
		// 반드시 argument를 갖는 super 생성자를 명시적으로 호출해야 함.
		// 하위 클래스 필드를 초기화하는 코드는 super 생성자를 호출 이후에 작성.
		this.battery = battery;
		// TODO Auto-generated constructor stub
	}
	
}
