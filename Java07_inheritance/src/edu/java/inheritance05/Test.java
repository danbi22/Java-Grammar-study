package edu.java.inheritance05;

class Test {
	private int x;
	protected int y;
	
	public Test(int x, int y) {
//		super(); 생략되어 있음 생략된 슈퍼클래스의 생성자는 object의 생성자
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}

}

class TestChild extends Test { // 부모클래스가 기본 생성자가 없기 때문에 에러 발생 
	private int z;
	
	public TestChild(int x, int y, int z) {
		super(x, y);
		this.z = z; 
	} 
	
	public void printInfo() {
		System.out.printf("x=%d, y=%d, z=%d%n", super.getX(), super.y, this.z);
		// private: 자기 자신 클래스에서만 직접 접근(사용)
		// 상속하는 하위 클래스에서도 보이지 않음(not visible)
		// protected: 같은 클래스이거나 상속하는 클래스에서 직접 접근(사용).
	}
}