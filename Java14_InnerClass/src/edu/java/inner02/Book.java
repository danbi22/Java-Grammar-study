package edu.java.inner02;

public class Book {
	// field
	private String title; // 책 제목
	private String author; // 책 저자
	private String publisher; // 출판사
		
	// constructor
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
	
	
}
