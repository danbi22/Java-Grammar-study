package edu.java.class04;

	/* 클래스의 멤버들:
	 * (1) 필드(멤버 변수)
	 * (2) 생성자
	 * (3) 메서드
	 */

public class Product {
	// 필드
	int productId; // 상품 아이디(코드)
	String productName; // 상품 이름
	int productPrice; // 상품 가격
	
	// 생성자:
	// (1) 기본 생성자
	public Product() {}
	
	// (2) argument 3개를 갖는 생성자
	public Product(int productId, String productName, int productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public static void main(String[] args) {
		
	}
}
