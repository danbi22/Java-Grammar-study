package edu.java.file03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 파일(하드디스크) ==> FileInputStream ==> BufferedInputStream ==> 프로그램
 * 		FIS: 하드디스크에 있는 파일을 직접 접근해서 읽고 메모리(RAM)에 내용을 적재
 * 		BIS: 메모리(RAM)에 있는 파일 내용을 읽는(read) 메서드를 제공
 * 
 * 파일(하드디스크) <== FileOutputStream <== BuffuredOutputStream <== 프로그램
 * 		FOS: 하드디스크에 파일 내용을 씀.
 * 		BOS: 메모리(RAM)에 데이터를 쓰는(write) 메서드 제공.
 */
public class FileMain03 {
	
	public static void main(String[] args) {
		// 메모리(BIS, BOS)를 사용한 파일 읽기, 쓰기
		String origin = "data/ratings.dat";
		String dest = "data/ratings-copy.dat";
		
		FileInputStream in = null; // 하드디스크에서 메모리까지 읽기 통로
		BufferedInputStream bin = null; // 메모리에서 프로그램까지 읽기 통로
		FileOutputStream out = null; // 메모리에서 하드디스크까지 쓰기 통로
		BufferedOutputStream bout = null; // 프로그램에서 메모리까지 쓰기 통로
		try {
			in = new FileInputStream(origin); // HDD ==> RAM
			bin = new BufferedInputStream(in); // RAM ==> Program
			
			out = new FileOutputStream(dest); // HDD <== RAM
			bout = new BufferedOutputStream(out); // RAM <== Program
			
			long start = System.currentTimeMillis();
			while (true) {
				byte[] buf = new byte[1024*1024]; // 4KB의 배열
				int read = bin.read(buf);
				if (read == -1) { // End Of File: EOF
					break;
				}
				bout.write(buf, 0, read); // 읽은 내용(buf)을 처음(0)부터 실제로 읽은 바이트 수(read) 만큼 write
			}
			long end = System.currentTimeMillis();
			
			System.out.println("복사 종료 시간:"+ (end-start)+"ms");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// Stream 객체를 close할 때에는 생성된 순서의 반대로 close를 호출해야 함.
				// 가장 마지막에 생성된 Stream 객체만 close하면, 다른 Stream객체들은 자동으로 close가 호출됨.
				bin.close();
				// in.close(); // 
				bout.close(); // -> out.close()는 자동으로 호출됨.
				// out.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
