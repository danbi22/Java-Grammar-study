package edu.java.inner01;

public class Outer {
	// field
	private int x;
	private String s;
	private int y;
	
	// constructor
	public Outer(int x, int y, String s) {
		this.x = x;
		this.y = y;
		this.s = s;
	}
	
	// method
	@Override
	public String toString() {
		return String.format("Outer(x=%d, y=%d, s=%s)", x, y, s);
	}
	
	// static이 아닌 멤버 내부 클래스(인스턴스 내부 클래스)
	public class Inner {
		// field
		private int y;
		
		// constructor
		public Inner(int y) {
			this.y = y;
		}
		
		// method
		public void printInfo() {
			System.out.println("---Inner Class---");
			System.out.println("y= " + y);
			System.out.println("x= " + x); // 외부 클래스가 가진 객체를 내부 클래스가 가질 수 있다. // 내부 클래스는 외부 클래스의 멤버들을 사용할 수 있다.
			System.out.println("s= " + s);
			System.out.println("this.y= " + Outer.this.y); // 변수 선언:가까운 위치에서 찾는다
		}
	}
	
}
