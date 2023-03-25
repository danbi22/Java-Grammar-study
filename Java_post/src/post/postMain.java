package post;

import java.util.Scanner;
//import post.Menu;
public class postMain {
	
	private final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("----- 블로그 프로그램 -----");
		
		postMain main = new postMain();
		
		boolean run = true;
		while (run) {
			int index = main.showMainMenu();
			Menu menu = Menu.getIndex(index);
			switch (menu) {
			case QUIT:
				run = false;
			case CREATE:
				break;
			case READ_ALL:
				break;
			case READ_AT:
				break;
			case UPDATE:
				break;
			case DELETE:
				break;
			default:
				System.out.println("메인메뉴 번호를 확인하세요");
				
			}
		}
		
	}


	private int showMainMenu() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("[0]종료 [1]글쓰기 [2]목록보기 [3]글 보기 [4]글 수정하기 [5]글 삭제하기");
		System.out.println("-------------------------------------------------------------------\n");
		
		System.out.println("사용할 기능의 번호를 입력해주세요.");
		return inputInteger();
	}
	
	private int inputInteger() {
		int num = 0;
		while(true) {
			try {
				num = Integer.parseInt(sc.nextLine());
				return num;
			} catch (NumberFormatException e) {
				System.out.println("정수를 입력하세요");
			}
		}
	}

}
