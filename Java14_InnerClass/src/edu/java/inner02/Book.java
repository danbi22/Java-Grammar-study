package edu.java.inner02;

public class Book {
	// field
	private String title; // 책 제목
	private String author; // 책 저자
	private String publisher; // 출판사
		
	// constructor
	/**
	 * 똑디 넣어라
	 * @param title
	 * @param author
	 * @param publisher
	 */
	public Book(String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}

	// method
	@Override
	public String toString() {
		return String.format("Book(title=%s, author=%s, publisher=%s)", title, author, publisher);
	}
	
	//--------- Factory(Builder) 디자인 패턴 -----------
	public static BookBuilder builder() {
		return new BookBuilder();
		// -> 외부 클래스는 static 내부 클래스의 private 생성자를 호출할 수 있다.
	}
	
	public static class BookBuilder {
		// field
		private String title; // 책 제목
		private String author; // 책 저자
		private String publisher; // 출판사
		
		// constructor
		private BookBuilder() {}
		
		public BookBuilder title(String title) {
			this.title = title;
			return this; // this: BookBuilder 타입으로 생성된 객체(인스턴스)
		}
		
		public BookBuilder author(String author) {
			this.author = author;
			return this; // this: BookBuilder 타입으로 생성된 객체(인스턴스)
		}
		
		public BookBuilder publisher(String publisher) {
			this.publisher = publisher;
			return this; // this: BookBuilder 타입으로 생성된 객체(인스턴스)
		}
		
		public Book build() {
			return new Book(title, author, publisher);
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
