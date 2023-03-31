package edu.java.inner02;

public class BuilderExample {

	public static void main(String[] args) {
		// Book 타입의 객체 생성
		Book book1 = new Book("나는 책", "유다한", "하이");
		System.out.println(book1);
		
		Book book2 = new Book("홍길동전", "허균", "조선책방");
		System.out.println(book2);
		
		Book book3 = new Book("허균", "홍길동전", "모름");
		System.out.println(book3);
		
		Book book4 = Book.builder().author("허균").title("홍길동전").build();
		System.out.println(book4);
		
		Book book5 = Book.builder().publisher("조선책방").author("김훈").title("하얼빈").build();
		System.out.println(book5);
	}
}