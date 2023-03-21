package edu.java.inheritance08;

public class Rectangle extends Shape {
	// field
	private double width; // 직사각형의 가로 길이
	private double height; // 직사각형의 세로 길이

	public Rectangle(String type, double width, double height) {
		super(type); // 상위 클래스의 argument를 갖는 생성자를 명시적으로 호출. 이 문장이 생략되면 상위클래스의 기본생성자라도 있어야한다.
		this.width = width;
		this.height = height;
	}

	@Override
	public double area() { // 상위클래스에서 만들어 준 틀을 이용해 기능을 만들어야한다.
		double area = width * height;
		return area;
	}

	@Override
	public double perimeter() {
		double perimeter = (width + height) * 2;
		return perimeter;
	}

}
