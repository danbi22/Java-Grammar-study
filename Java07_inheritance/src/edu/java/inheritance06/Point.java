package edu.java.inheritance06;

import java.util.Objects;

public class Point {
	// field
	private int x;
	private int y;
	
	// 생성자: (1) 기본 생성자, (2) argument가 2개인 생성자.
	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// getters & setters
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	// toString override: "Point(x=0, y=0)"
	@Override // 애너테이션
	public String toString() {
//		return "Point(x="+this.x+", y="+this.y+")";
		String s = String.format("Point(x=%d, y=%d)", this.x, this.y);
		return s;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) { // true 혹은 false를 리턴(boolean) 파라미터로를 객체를 가져옴 
		if (this == obj) // this와 obj가 같은 주소값을 가지고 있으면~
			return true;
		if (obj == null) // obj가 주소값을 가지고 있지 않으면. 객체를 참조하고 있지 않으면
			return false;
		if (getClass() != obj.getClass()) // 클래스 이름이 다르면  
			return false;
		// 클래스 이름이 같으면 -> casting을 할 수 있음.
		Point other = (Point) obj;
		return x == other.x && y == other.y;
		// 주소값을 비교하는 것이 아니라 값과 이름이 같으면 같다라고 하자로 재정의(Override)
	}
	
	
	
}
