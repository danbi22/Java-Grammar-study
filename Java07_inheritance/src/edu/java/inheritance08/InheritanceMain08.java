package edu.java.inheritance08;

public class InheritanceMain08 {
	
	public static void main(String[] args) {
		
//		Shape shape = new Shape("직사각형"); 
//		 추상 클래스는 생성자를 생성할 수 없다. 보이지만 쓸 수 없다. 객체를 생성할 수 없다.
		Rectangle rectangle = new Rectangle("직사각형", 4, 5);
		rectangle.draw();
		
		Circle circle = new Circle("원", 5);
		circle.draw();
	}
}
