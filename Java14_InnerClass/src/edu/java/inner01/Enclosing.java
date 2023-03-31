package edu.java.inner01;

public class Enclosing {
	// field
	public static int var = 123;
	private int x;
	
	//constructor
	public Enclosing(int x) {
		this.x = x;
	}
	
	public static void test() {
		System.out.println(var);
//		System.out.println(x);
		// -> static 멤버는 다른 static 멤버들만 사용 가능. non-static 멤버들은 사용 불가.
	}
	
	@Override
	public String toString() {
		// 인스턴스(static이 아닌) 메서드는 static 또는 non-static 멤버를 모두 사용할 수 있음.
		return String.format("Enclosing(x=%d, var=%d)", x, var);
	}
	
	// static 내부 클래스 - 외부 클래스의 객체 생성 여부와 상관 없이 생성자를 호출할 수 있음. 
	public static class Nested {
		private int x;
		
		public Nested(int x) {
			this.x = x;
		}
		
		public void printInfo() {
			System.out.println("--- static inner class ---");
			System.out.println("x= " + x); // 내부 클래스 멤버는 사용가능
			Enclosing e = new Enclosing(1);
			System.out.println("Enclosing"+e.x);
			System.out.println("Enclosing var"+var); //var을 찾는 경로: 가장 가까운데서(Nested) 먼데로(Enclosing) 가서 찾는다
			// static 내부 클래스에서는 외부 클래스의 non-static을 사용할 수 없음.
		}
	}
}
