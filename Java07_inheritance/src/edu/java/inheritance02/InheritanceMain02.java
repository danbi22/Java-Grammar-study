package edu.java.inheritance02;

public class InheritanceMain02 {
	
	public static void main(String[] args) {
		// 상속 관계에서 생성자 호출 순서:
		BusinessPerson p1 = new BusinessPerson();
		System.out.println();
		BusinessPerson p2 = new BusinessPerson("아이티윌");
		System.out.println();
		BusinessPerson p3 = new BusinessPerson("유다한", "아이티윌");
	}

}
