package edu.java.swing07;

// MVC 아키텍쳐에서 Model 객체
public class Score {
	//field
	private int korean;
	private int english;
	private int math;
	
	// constructor
	public Score() {}

	public Score(int korean, int english, int math) {
		super();
		this.korean = korean;
		this.english = english;
		this.math = math;
	}

	// method
	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	// TODO: 세 과목의 총점을 int 타입으로 리턴하는 메서드. getTotal
	public int getTotal(int korean, int english, int math) {
		return korean + english + math;
	}
	
	// TODO: 세 과목의 평균을 double 타입으로 리턴하는 메서드. getMean
	
	// TODO: toString override

	
}
