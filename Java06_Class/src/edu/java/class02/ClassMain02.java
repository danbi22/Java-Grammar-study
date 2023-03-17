package edu.java.class02;

public class ClassMain02 {
	
	public static void main(String[] args) {
		// tv 객체(object) 사용 - tv 켬/끔, 채널변경, 볼륨변경, ...
		
		// (1) BasicTV 생성
		BasicTv tv = new BasicTv();
		
		// (2) 생성된 tv 객체(인스턴스)의 필드 또는 메서드를 사용
		// tv.powerOn: 생성된 객체(인스턴스) tv의 필드(멤버 변수) powerOn
		System.out.println(tv.powerOn);
		tv.powerOnOff(); // 객체의 메서드 호출
		
		System.out.println(tv.powerOn);
		
		for (int i = 0; i < 10; i++) {
			tv.channe1Up();	
		}
		System.out.println(tv.channel);
		
		for(int i = 0; i < 10; i++) {
			tv.channelDown();	
		}
		
		System.out.println(tv.channel);
		
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		System.out.println(tv.volume);
	}

}
