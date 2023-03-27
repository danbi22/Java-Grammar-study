package edu.java.set01;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * Collection<E>
 * |__List<E>
 * 		|__ArrayList<E>, LinkedList<E>, ...
 * 
 * Collection<E>
 * |__Set<E>
 * 		|__HashSet<E>, TreeSet<E>, ...
 * 
 * Set의 특징:
 * 1. 중복된 값을 저장하지 않는다. (예) {1, 2} == {1, 2, 1, 2}
 * 2. 저장하는 순서가 중요하지 않음. 인덱스가 없음. (예) {1, 2} == {2, 1}
 * 
 * 
 * HashSet: Hash 알고리즘(검색을 빠르게 할 수 있는 알고리즘)을 사용한 Set // 
 * TreeSet: Tree 알고리즘(정렬을 빠르게 할 수 있는 알고리즘)을 사용한 Set. // 정렬할 때에 사용하면 좋다
 */
public class SetMain01 {
	
	public static void main(String[] args) {
		// String을 원소로 갖는 TreeSet 변수 선언, 객체 생성.
		TreeSet<String> set = new TreeSet<>();
		System.out.println(set.size());
		
		set.add("hello");
		set.add("apple"); // TreeSet은 정령된 형태.
		set.add("add");
		set.add("hello"); // 중복된 데이터는 저장되지 않는다.
		set.add("zip");
		set.add("banana");
		
		System.out.println(set); // Set은 toString을 override.
		
		// Set은 인덱스를 갖지 않기 때문에 get(int index) 메서드는 제공되지 않음
		// for 문장을 이용해서 인덱스를 사용하는 것은 불가능
		// for-each문장을 사용해서 값을 꺼내는 것은 가능
		for (String s : set) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		Iterator<String> itr = set.iterator(); // 오름차순 반복 기능
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		Iterator<String> itr2 = set.descendingIterator(); // 내림차순 반복 기능 
		while(itr2.hasNext()) {
			System.out.print(itr2.next()+" ");
		}
		System.out.println();
		
		
		
	}

}
