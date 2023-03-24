package logUp;

import java.util.Scanner;

public class LogUpview {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		LogUpview luv = new LogUpview();
		LogUpModel lum = new LogUpModel();
		
		System.out.println("--- 회원가입 ---");
		System.out.print("아이디를 입력하세요> ");
		String id = luv.inputString();
		System.out.print("비밀번호를 입력하세요> ");
		String pw = luv.inputString();
		System.out.print("비밀번호를 재입력하세요> ");
		String rpw = luv.inputString();
		System.out.print("이름을 입력하세요> ");
		String name = luv.inputString();
		System.out.print("생년월일을 입력하세요> ");
		String birth = luv.inputString();
		System.out.print("성별을 입력하세요>");
		String sex = luv.inputString();
		System.out.print("이메일을 입력하세요>");
		String email = luv.inputString();
		System.out.print("핸드폰 번호를 입력하세요>");
		String phone = luv.inputString();
		
		LogUpModel(id, pw, rpw, name, birth, sex, email, phone);
		
	}
	/**
	 * 아이디를 입력하는 메서드
	 */
	private void inputLogUp() {
		String id = inputString();
		String pw = inputString();
		String rpw = inputString();
		String name = inputString();
		String birth = inputString();
		String sex = inputString();
		String email = inputString();
		String phone = inputString();
		LogUpModel lum = new LogUpModel();
	}
	
	public String inputString() {
		String x = sc.nextLine();
		return x;
	}

}
