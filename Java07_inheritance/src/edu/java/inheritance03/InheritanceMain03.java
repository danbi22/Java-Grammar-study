package edu.java.inheritance03;

public class InheritanceMain03 {
	
	public static void main(String[] args) {
		// Car 타입의 객체 생성
		Car car1 = new Car(100, 30);
		car1.drive();
		
		// HybridCar 타입의 객체 생성
		HybridCar car2 = new HybridCar(90, 50, 100);
		car2.drive();
	}

}
