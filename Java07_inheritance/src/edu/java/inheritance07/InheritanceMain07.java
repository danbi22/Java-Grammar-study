package edu.java.inheritance07;

// 추상 메서드
// 메서드 signature(수식어, 리턴타입, 이름 파라미터 선언)만 선언되어 있고
// 메서드의 (body(본체), { ... })가 구현되지 않은 메서드.
// 추상 메서드는 반드시 abstract 키워드로 수식해야 함.
// 추상 메서드 선언은 반드시 세미콜론(;)으로 끝나야 함. 세미콜론이 없다면 추상메서드인지 알 수 없기 때문에 꼭 붙여 주어야 한다.

// 추상 클래스 
// abstract로 선언된 클래스.
// 추상메서드를 갖는 클래스는 반드시 추상 클래스로 선언해야 함.
// 객체를 생성하지 못하는 클래스
// 대부분의 경우 추상 클래스는 추상 메서드를 가져야하지만
// 추상 클래스는 객체를 생성할 수 없음.

// 추상메서드와 추상클래스는 상속하는 하위 클래스에서 메서드 구현(override)을 목적으로 함.
// 하위클래스에서 이런 메서드를 만들어 줬으면 할 때 추상메서드를 사용한다.

abstract class Animal{ // 클래스는 파일당 하나만 만드는 것이 좋다. // 추상메서드의 수식어 abstract
//	public void move(); // 메서드의 바디({})가 없다. 추상메서드는 abstract를 붙여주어야한다. 
	public abstract void move(); // 추상메서드는 바디를 가질 수 없다. abstract는 수식어이기 때문에 리턴타입 앞에 붙어야한다.
	// 움직인다는 것도 추상적이다. 뱀은 기고, 사자는 네발로 걷고, 인간은 두발로 걷고, 새는 난다.
	// 
}
class Dog extends Animal{
	// 에러메세지: The type Dog must implement the inherited abstract method Animal.move()
		//  
		// 구현: 바디를 만든다{}
	@Override // 구현(implemetation): 추상 메서드를 override해서 메서드 바디를 작성
	public void move() {
		System.out.println("강아지 총총총...");
	}
}

class Fish extends Animal { // 객체를 생성할 수 있는 일반 클래스
	@Override
	public void move() {
		System.out.println("물고기 스윔스윔...");
		
	}
}

class Bird extends Animal {
	@Override
	public void move() {
		System.out.println("새는 훨훵...");
		
	}
}
public class InheritanceMain07 {
	
	public static void main(String[] args) {
//		Animal animal = new Animal() {} // 애니멀타입의 객체를 생성할 수 없다
		// 추상 클래스 타입의 객체는 생성할 수 없다.(cannot instantiate)
			
		Dog dog = new Dog();
		// 추상클래스를 구현하는 하위 타입(클래스)의 객체는 생성할 수 있음.
		dog.move();
		
		Fish fish = new Fish();
		fish.move();
		
		Bird bird = new Bird();
		bird.move();
		
		// 다형성: SuperType var = SubType object;
		Animal[] animals = {bird, fish, dog};
		// 배열에 넣을 수 있다.
		for (Animal a : animals) {
			a.move();
		// 배열에 객체가 들어있다. 
		// animals에는 Animal객체가 들어있고 Animal은 추상클래스이며 move()라는 추상클래스를 들고있기에 Animal안에있는 객체들은 모두 move()를 오버라이드하여 가지고 있다.
		}
	}

}
