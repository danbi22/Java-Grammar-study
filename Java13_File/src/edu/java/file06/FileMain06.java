package edu.java.file06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import edu.java.file05.Product;

public class FileMain06 {

	public static void main(String[] args) {
		// Product 타입 객체를 1,000,000개 생성하고 ArrayList에 저장
		ArrayList<Product> products = new ArrayList<>();
		ArrayList<Product> productss = new ArrayList<>();
		for (int i = 0; i < 1_000_000; i++) {
			Product p = new Product(i, "name", i*10);
			products.add(p);
		}
		
		System.out.println("size: "+ products.size());
		System.out.println(products.get(999));
	
	
		// 1,000,000개의 원소를 갖는 리스트를 직렬화해서 파일에 씀.
		String productsList = "data/products.txt";
		
		try (FileOutputStream out = new FileOutputStream(productsList);
				BufferedOutputStream bout = new BufferedOutputStream(out);
				ObjectOutputStream oout = new ObjectOutputStream(bout);
				
				FileInputStream in = new FileInputStream(productsList);
				BufferedInputStream bin = new BufferedInputStream(in);
				ObjectInputStream oin = new ObjectInputStream(bin);
		){
			oout.writeObject(products);
			Product pro = (Product)oin.readObject();
			productss.add((Product) pro);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 파일에 저장된 데이터를 읽어서 ArrayList<Product> 타입으로 역직렬화
		
		System.out.println(productss.size());
	}
}
