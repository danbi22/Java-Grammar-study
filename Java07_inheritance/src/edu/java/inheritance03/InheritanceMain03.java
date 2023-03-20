package edu.java.inheritance03;

public class InheritanceMain03 {
	
	public static void main(String[] args) {
		// Car 타입의 객체 생성
		Car car1 = new Car(100, 30);
		car1.drive();
		
		// HybridCar 타입의 객체 생성
		HybridCar car2 = new HybridCar(90, 50, 100);
		car2.drive();
		
		// 다형성(polymorphism): 하나의 객체를 두 개 이상의 타입으로 부를 수 있는 것.
		// (1) 하이브리드 자동차는 하이브리드 자동차다.
		// (2) 하이브리드 자동차는 자동차다
		Car car3 = new HybridCar(100, 50, 100);
		car3.drive();
	}

}
