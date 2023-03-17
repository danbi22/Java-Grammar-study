package edu.java.inheritance01;

// 스마트TV는 TV이다.
// TV: 상위 클래스, 스마트TV: 하위 클래스
// 상위클래스가 먼저 있고 하위 클래스는 상속받아 다른것을 더 추가한다.
public class BasicTv {
	// 필드
	private boolean powerOn;
	private int channel;
	private int volume;
	
	// 메서드
	public void powerOnOff() {
		if (powerOn) {
			powerOn = false;
			System.out.println("TV 끔...");
		} else {
			powerOn = true;
			System.out.println("TV 켬....");
		}
	}
	
	public void printInfo() {
		System.out.printf("TV(powerOn=%s, channel=%d, volume=%d)\n",
									powerOn, channel, volume);
	}
}
