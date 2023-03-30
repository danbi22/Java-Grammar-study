package edu.java.file08;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/*
 * IO Stream: 바이트 스트림(byte Stream). 읽기/쓰기의 기본 단위는 byte 단위
 * 		모든 파일 형식(txt, jpg, mp4, docx, pptx, ...)에서 사용 가능.
 * 		InputStream
 * 		|__ FileInputStream, BuffuredInputStream, ObjectInputStream, ...
 * 		OutputStream
 * 		|__ FileOutputStream, BuffuredOutputStream, ObjectOutputStream, ...
 * 
 * Reader/Writer: 문자 스트림(character stream). 읽기/쓰기의 기본 단위는 "문자" 단위.
 * 		텍스트 파일 형식(txt, csv, dat, ...)에서만 사용.
 * 		Reader
 * 		|__ InputStreamReader, BufferedReader
 * 				|__ FileReader
 * 		Writer
 * 		|__OutputStreamWriter, BufferedWriter
 * 				|__FileWriter
 * 
 * 	인코딩(encoding): 문자에 해당하는 코드(정수)로 변환. (예) 'A' -> 65
 * 	디코딩(decoding): 문자 코드(정수)에 해당하는 문자로 변환. (예) 65 -> 'A'
 * 운영체제마다 기본 인코딩 방식이 다르다
 * 운영체제(OS, Operating System)의 기본 인코딩 방식:
 * 		- 한글 MS-Windows: EUC-KR(MS949, CP949), 영문 MS-Windows: CP1252
 * 		- MacOS, Linux: UTF-8
 * 
 * 		Java 11 이전 버전까지는 FileReader와 FileWriter에서 인코딩 설정을 할 수 없었음.
 * 		InputStreamReader, OutputStreamWriter가 인코딩 설정 기능을 가지고 있었음.
 * 		Java 11 이후 버전부터는 FileReader와 FileWriter에서도 인코딩 설정을 할 수 있게 업데이트됨.
 * 
 * 
 */
public class FileMain08 {
	
	public static void main(String[] args) {
		String ansiFile = "data/encoding-ansi.txt";
		String utf8File = "data/encoding-utf8.txt";
		
		// 1. Java 11 이전 버전에서 문자 스트림을 사용하는 방법:
		// FileReader, FileWriter는 권장하지 않음.
		try (
				// 1. byte stream 생성
				FileInputStream in = new FileInputStream(ansiFile); // byte stream 
				// FileInputStreamReader가 아닌 FileInputStream을 쓴다 
				// 자바 11 버전 이전에서는 FileInputStreamReader가 인코딩방식을 선택하고 인코딩해주는 기능이 없다
				// 인코딩방식을 선택하고 인코딩해주는 기능은 InputStreamReader에 들어있다.
				
				// 2. 인코딩을 설정한 문자 스트림을 생성
				InputStreamReader reader = new InputStreamReader(in, "CP949"); // 문자 스트림
				
				// 3. 메모리 버퍼를 사용해서 읽기 속도를 빠르게 하기 위해서
				BufferedReader br = new BufferedReader(reader); // 메모리에서 문자 스트림을 사용
				// BufferedReader의 read()는 1글자(char)를 읽음 읽을 글자가 없으면 -1을 리턴
		) {
			while (true) {
				int read = br.read(); // 1글자를 읽음. reads a single character
				if (read == -1) { // EOF
					break;
				}
				System.out.print((char)read);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		// Java 11 버전부터 문자 스트림을 사용하는 방법:
		// FileReader, FileWriter에서 인코딩 방식을 설정할 수 있게됨.
		try (
				// 1. FileReader를 생성할 떄 인코딩 방식을 설정.
				FileReader reader = new FileReader(utf8File, Charset.forName("UTF-8"));
				// 2. 메모리 버퍼를 사용해서 읽기 속도를 빠르게
				BufferedReader br = new BufferedReader(reader);
		) {
		
			while (true) {
//				int read = br.read(); // 1글자씩 읽는다.
//				if(read == -1) {
//					break;
//				}
//				System.out.print((char)read);
				
				String line = br.readLine();
				if (line == null) {
					break;
				}
				System.out.println(line);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
