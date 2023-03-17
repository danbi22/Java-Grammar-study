package edu.java.class02;

/*
  클래스(class): 프로그램에서 필요한 데이터와 기능을 묶어서 하나의 "데이터 타입"으로 정의한 것
  - 데이터 -> 필드(field), 멤버 변수, 속성(property)
  - 기능 -> 메서드(method)
  데이터 타입 -> 변수 선언, 파라미터 선언, 메서드 리턴 타입 선언.
  클래스 선언: [수식어] class 클래스이름 { ... }
 * 클래스 이름 작성:
 * - 영문자, 숫자, _, $를 사용할 수 있음.
 * - 숫자로 시작할 수 없음
 * - 대문자로 시작하는 camel 표기법을 권장.
 */

public class BasicTv {
	// field = 클래스의 모든 메서드에서 사용 가능.
	private static final int MAX = 5;
	private static final int MIN = 0;
	boolean powerOn; // TV의 전원 상태(true: ON, false: OFF)를 저장하는 필드.
	int channel; // TV의 현재 채널을 저장하는 필드
	int volume; // TV의 현재 음량을 저장하는 필드.
	
	// method
	public void powerOnOff() {
		if (powerOn) { // tv가 켜져있으면
			powerOn = false; // tv를 끔
			System.out.println("TV OFF");
		} else { // tv가 꺼져있으면
			powerOn = true; // tv를 켬
			System.out.println("TV ON");
		}
	}
	
	public void channe1Up() {
		if (powerOn) {  // tv 전원이 on
			if (channel < MAX) { // tv 채널 번호가 최댓값보다 작은 경우
				channel++; // 현재 채널 번호를 1 증가
			} else { // tv 채널 번호가 최댓값보다 크거나 같으면
				channel = MIN; // tv 채널의 최솟값으로 바꿈(채널을 순환시킴)
			}
		}
		
		System.out.println("채널: "+channel);
	}
	
	public void channelDown() {
		if (powerOn) {  // 만약 tv 전원이 켜져있고
			if (channel > MIN) { // 채널이 MIN보다 크면
				channel--; // 채널 번호를 1감소
			} else { // 채널이 MIN보다 크지 않다면 
				channel = MAX; // 채널을 최대값으로 돌림
			}
		}
		System.out.println("채널: "+channel);
	}
	
	// 볼륨업
	public void volumeUp() {
		if (powerOn) {
			if (volume < MAX) {
				volume++;
			}
			
		}
		System.out.println("볼륨: "+volume);
	}
	
	// volume down
	public void volumeDown() {
		if (powerOn) {
			if (volume > MIN) {
				volume--;
			}
		}
		System.out.println("볼륨: "+volume);
	}
}
