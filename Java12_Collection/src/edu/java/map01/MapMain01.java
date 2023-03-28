package edu.java.map01;

import java.util.HashMap;

/*
 * <E>: Element(원소)
 * Collection<E>
 * |__List<E>, Set<E>
 * List, Set의 공통점: 한가지 타입의 객체들을 여러개 저장할 수 있는 데이터 타입.
 * List:인덱스가 있음. 저장하는 순서가 중요(add 호출할 때마다 인덱스 자동증가) 중복된 값을 저장할 수 있음.
 * Set: 인덱스 없음. 중복된 값을 저장할 수 없음.
 *  
 *  Map<K, V>
 *  |__ HashMap<K, V>, TreeMap<K, V>
 *  Map: 키(key)와 값(value)의 쌍으로 구성된 데이터를 저장하는 데이터 타입
 *  	(예) 1-강효남, 2-김다훈, 3-김도현, ... , 20-김다훈, ...
 *  	(1) key: 중복된 값을 가질 수 없음. 연속된 값을 가질 필요는 없음.
 *  				리스트에서 인덱스의 역할.(데이터를 저장/검색/수정/삭제할 때 값을 찾기 위한 용도).
 *  	(2) Value: 중복된 값을 가질 수 있음(동명이인)
 *  	(3) HashMap: 검색을 빠르게 할 수 있는 Map
 *  	(4) TreeMap: 정렬을 빠르게 할 수 있는 Map 
 */
public class MapMain01 {
	
	public static void main(String[] args) {
		// 정수를 key로 하고 문자열을 Value로 하는 HashMap 변수선언, 초기화(객체생성)
		HashMap<Integer, String> students = new HashMap<>();
		
		System.out.println("map size = "+students.size());
		System.out.println(students);
	}

}
