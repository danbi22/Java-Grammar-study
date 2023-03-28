package edu.java.file01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 입/출력 스트림(Input/Output Stream): 프로그램이 값(데이터)을 입력받거나 출력하는 통로.
 * 		(예) System.in: 입력 스트림 객체, System.out 출력 스트림 객체.
 * 프로그램 <== InputStream <== 입력 장치(키보드, 마우스, 터치스크린, 파일, ...) 화살표는 데이터가 흘러가는 방향
 * 프로그램 ==> OutputStream ==> 출력 장치(모니터, 프린터, 프로젝터, 파일, ...)
 * 
 * 프로그램 <== FileInputStream <== 파일
 * 프로그램 ==> FileOutputStream ==> 파일
 * 
 * java.io.InputStream: 데이터를 읽어오는 통로
 * |__ FileInputStream: 파일에서 데이터를 읽어오는 통로
 * 		(1) FileInputStream 객체 생성
 * 		(2) FileInputStream 객체의 read 관련 메서드를 사용
 * 		(3) FileInputStream 객체를 close. // 반드시 해야함.
 * 
 * java.io.OutputStream: 데이터를 내보내는(쓰는, write) 통로.
 * |__ FileOutputStream: 파일에 데이터를 쓰는 통로.
 * 		(1) FileOutputStream 객체 생성
 * 		(2) FileOutputStream 객체의 write 관련 메서드를 사용
 * 		(3) FileOutputStream 객체를 close.
 */
public class FileMain01 {
	
	public static void main(String[] args) {
		 String fileName = "C:\\Users\\ITWILL\\Desktop\\메모장 정리/회원가입.txt"; // 파일 이름(경로)
		 String copyFile = "data/hello-copy.txt"; // 복사 파일 이름(경로)
		 
		 FileInputStream in = null;
		 FileOutputStream out = null;
		 try {
			 // 파일을 읽기 위한 스트림 객체 생성.
			in = new FileInputStream(fileName);
			
			// 파일에 데이터를 쓰기 위한 스트림 객체 생성
			out = new FileOutputStream(copyFile);
			
			while (true) {
				int read = in.read(); // 파일에서 1byte를 읽음, // 문서의 끝에 도달하면 -1을 리턴
				if(read == -1) {
					break;
				}
				out.write(read); // 파일에 1byte를 씀.
				
				 
			}
			System.out.println("파일 복사 완료");
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} finally {
			try {
				in.close(); // FileInputStream을 닫음. 파일을 닫았다.
				out.close(); // FileOutputStream을 닫음
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 
	}
}
