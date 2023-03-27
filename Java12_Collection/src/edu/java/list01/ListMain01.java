package edu.java.list01;

import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;

/*
 * 리스트(list)의 특징:
 * 1. 한가지 타입의 값들을 여러개 저장할 수 있는 데이터 구조체.
 * 2. 값들을 저장하는 순서가 중요 - index를 가지고 있음. 데이터를 인덱스 순서에 따라 순차적으로 집어 넣어야한다.
 * 3. 값들을 저장할 때마다 인덱스는 자동으로 증가 - 배열과는 다르게 저장용량으로 자동으로 증가.
 * 4. 중간에 있는 값을 삭제하면 인덱스를 자동으로 재배열됨. - 자동을 인덱스가 당겨진다.
 * 5. 같은 값을 여러번 저장할 수 있음. -> Set과 다른 점.
 * 
 * ArrayList의 특징
 * 1. 배열(array)을 사용하는 리스트.
 * 2. 단점: 데이터를 저장(add)하거나 삭제(remove)할 때 속도가 느림.
 * 3. 장점: 데이터를 검색(get)할 때 속도가 빠름
 *  
 * LinkedList의 특징
 * 1. linked list 알고리즘을 사용한 리스트.
 * 2. 장점: 데이터를 저장하거나 삭제할 때 속도가 빠름
 * 3. 단점: 데이터를 검색할 때 속도가 느림
 * 
 * Collection<E>
 * |__List<E>
 * 		 |__ ArrayList<E>, LinkedList<E>, ...
 * 				
 * Java에서 괄호의 용도
 * () if, while, switch, method, 우선순위 
 * {} body, block, { ... }array
 * [] 인덱스
 * <>
 * 
 */
public class ListMain01 {
	
	public static void main(String[] args) {
		// 문자열을 저장하는 ArrayList 객체를 생성
		// ArrayList<저장할 원소 타입> 변수이름 = new ArrayList<>();
		// 생성자 호출에는 리스트의 원소 타입을 생략해도 됨.
		ArrayList<String> languages = new ArrayList<>(); // new ArrayList<String>();를 간단히 쓴 것.
		
		System.out.println("리스트 크기: " + languages.size());
		System.out.println("리스트의 내용: " + languages); // 배열의경우 [java.lang.String@... 
		// ArrayList는 toString() 메서드가 override 되어있음 // ArrayList안의 값을 출력해줌 [Java, SQL]
		
		// 리스트에 원소를 추가: add()
		languages.add("Java");
		languages.add("SQL");
		languages.add("HTML");
		languages.add("Java");
		
		System.out.println("리스트 크기: " + languages.size());
		System.out.println("리스트의 내용: " + languages);
		
		// 리스트에서 인덱스 위치의 원소를 리턴: get(int index)
		System.out.println(languages.get(0)); // 인덱스는 0부터 시작
		System.out.println(languages.get(1)); 
		
		
		for (int i = 0; i < languages.size(); i++) {
			System.out.print(languages.get(i)+" ");
		}
		System.out.println();
		
		// remove(Object o): 리스트에서 처음 등장하는 o와 같은 원소를 찾아서 삭제
		// remove(int index): 리스트에서 인덱스 위치에 있는 원소를 삭제		
		languages.remove("Java"); // remove(Object o)
		System.out.println(languages);
		
		for (int i = 0; i < languages.size(); i++) {
			System.out.print(languages.get(i)+" ");
		}
		System.out.println();
		
		languages.remove(2);

		for (int i = 0; i < languages.size(); i++) {
			System.out.print(languages.get(i)+" ");
		}
		System.out.println();
		
		for (String x : languages) {
			System.out.print(x+"   ");
		}
		System.out.println();
		
		// Iterator<E> 객체를 사용한 리스트 원소들 반복.
		// 반복을 해줄수 있는 기계
		Iterator<String> itr = languages.iterator(); // Iterator 객체 생성
		while (itr.hasNext()) { // 배열에 원소가 있는지 확인하고 boolean타입으로 리턴
			System.out.println(itr.next()); // next()는 값을 읽고 리턴 인덱스를 한칸 옆으로 옮긴다.
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
