package edu.java.set02;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain02 {
	
	public static void main(String[] args) {
		// Integer를 원소로 갖는 HashSet 변수를 선언, 객체 생성
		HashSet<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(100);
		set.add(52);
		set.add(1);
		// set은 중복된 데이터를 저장하지 않음. 중복된 데이터를 사용하길 원하면 List를 사용해야함
		
		System.out.println(set);
		
		for (Integer n : set) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
	
	}
}
