package edu.java.list03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public class ListMain03 {
	
	public static void main(String[] args) {
		// 문자열들을 원소로 갖는 리스트 생성과 동시에 초기화.
		String[] a = {"a", "b", "c", "d"}; // 배열을 경우임
		
		// Arrays.asList(...) - 아규먼트로 전달된 값들을 원소로 갖는 리스트 객체를 생성.
		List<String> subjects = Arrays.asList("Java", "SQL", "HTML", "CSS", "JavaScript", "Servlet", "JSP", "Spring", "Python");
		System.out.println(subjects);
		
		// 리스트 subjects에서 5글자 이상인 문자열들만 저장하는 리스트를 만들고 출력.
		LinkedList<String> inFiveWord = new LinkedList<>();
		for (String s : subjects) {
			if (s.length() >= 5) {
				inFiveWord.add(s);
			}
		}
		System.out.println(inFiveWord);
		
		Iterator<String> itr = subjects.iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			if (s.length() >= 5) {
				inFiveWord.add(s);
			}
		}
		
		System.out.println(inFiveWord);
		
		
		
		// 리스트 subjects의 원소들의 글자수를 저장하는 리스트를 만들고 출력
		LinkedList<Integer> wordsNum = new LinkedList<>();
		for (String s : subjects) {
			wordsNum.add(s.length());
		}
		
		System.out.println(wordsNum);
		
		// 정수(0, 1)를 저장하는 리스트를 생성.
		List<Integer> codes = Arrays.asList(0, 1, 0, 1, 1);
		
		// 리스트 codes의 원소가 0이면 "male", 1이면 "Female"을 원소로 갖는 리스트를 만들고 출력
		ArrayList<String> sex = new ArrayList<>();
		for (Integer n : codes) {
			if (n == 0) {
				sex.add("male");
			} else {
				sex.add("Female");
			}
		sex.add((n == 0) ? "male" : "female");
		}
		
		
		System.out.println(sex);
	}

}
