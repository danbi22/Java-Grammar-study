package edu.java.file06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import edu.java.file05.Product;

public class FileMain06_1 {

	public static void main(String[] args) {
		// Product 타입 객체를 1,000,000개 생성하고 ArrayList에 저장
		LinkedList<Product> products = new LinkedList<>();
		LinkedList<Product> productss = new LinkedList<>();
		for (int i = 0; i < 1_000_000; i++) {
			Product p = new Product(i, "name", i*10);
			products.add(p);
		}
		
		System.out.println("size: "+ products.size());
		System.out.println(products.get(999));
	
	
		// 1,000,000개의 원소를 갖는 리스트를 직렬화해서 파일에 씀.
		String productsList = "data/productsss.txt";
		
		FileOutputStream out = null;
		BufferedOutputStream bout = null;
		ObjectOutputStream oout = null;
		try {
			out = new FileOutputStream(productsList);
			bout = new BufferedOutputStream(out);
			oout = new ObjectOutputStream(bout);
			
			long start = System.currentTimeMillis();
			
			oout.writeObject(products);
			long end = System.currentTimeMillis();
			System.out.println("소요시간: "+(end - start)+"ms");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				oout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// 파일에서 ArrayList를 받아 온다.
		try (FileInputStream in = new FileInputStream(productsList);
				BufferedInputStream bin = new BufferedInputStream(in);
				ObjectInputStream oin = new ObjectInputStream(bin);
		) {
			long start = System.currentTimeMillis();
			productss = (LinkedList<Product>) oin.readObject();
			long end = System.currentTimeMillis();
			System.out.println("소요시간: "+ (end - start)+"ms");
			System.out.println("size"+productss.size());
			System.out.println(productss.get(999));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
