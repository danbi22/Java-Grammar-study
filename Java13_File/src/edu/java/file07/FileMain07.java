package edu.java.file07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;

public class FileMain07 {
	
	public static void main(String[] args) {
		// TODO
		// 1. ArrayList<Student> 객체 생성
		// 2. 1,000,000개의 Strudent 객체를 리스트에 저장 - Random
		// 3. 리스트를 students.dat 파일에 (직렬화해서) 쓰기
		// 4. 파일에서 데이터를 읽어서 역직렬화 -> 읽은 데이터 확인.
		Random random = new Random();
		ArrayList<Student> students = new ArrayList<>();
		ArrayList<Student> students2 = new ArrayList<>();
		long starts = System.currentTimeMillis();
		for (int i = 0; i <1_000_000; i++) {
			int java = random.nextInt(101);
			int web = random.nextInt(101);
			int python = random.nextInt(101);
			Score score = new Score(java, web, python);
						 
			Student student = new Student(i, "i", score);
			students.add(student);
		}
		long ends = System.currentTimeMillis();
		System.out.println("for문 소요시간: "+(ends-starts)+"ms");
		System.out.println("student의 size: "+students.size());
		System.out.println("student의 1234번째 인덱스의 값: "+students.get(1234));
		
		String file = "data/students.dat";
		
		try (FileOutputStream out = new FileOutputStream(file);
				BufferedOutputStream bout = new BufferedOutputStream(out);
				ObjectOutputStream oout = new ObjectOutputStream(bout);
		){
			long start = System.currentTimeMillis();
			oout.writeObject(students);
			long end = System.currentTimeMillis();
			System.out.println("write 소요시간: "+(end-start)+"ms");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		FileInputStream in = null;
		BufferedInputStream bin = null;
		ObjectInputStream oin = null;
		
		try {
			in = new FileInputStream(file);
			bin = new BufferedInputStream(in);
			oin = new ObjectInputStream(bin);
			
			long start = System.currentTimeMillis();
			students2 = (ArrayList<Student>)oin.readObject();
			long end = System.currentTimeMillis();
			System.out.println("read 소요시간"+(end-start)+"ms");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("student2의 size: "+students2.size());
		System.out.println("student2의 1234번째 인덱스의 값: "+students2.get(1234));
		
		
		
		
		
		
		
		
		
	}
}
