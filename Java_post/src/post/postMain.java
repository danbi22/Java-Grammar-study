package post;

import java.util.Scanner;
//import post.Menu;
public class postMain {
	
	private final Scanner sc = new Scanner(System.in);
	private final PostDaoImpl dao = PostDaoImpl.getInstance();
	
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
				break;
			case CREATE:
				main.write();
				break;
			case READ_ALL:
				main.showList();
				break;
			case READ_AT:
				main.showAt();
				break;
			case UPDATE:
				main.update();
				break;
			case DELETE:
				main.delete();
				break;
			default:
				System.out.println("메인메뉴 번호를 확인하세요");
				
			}
		}
		System.out.println("프로그램을 종료합니다.");
		
	}


	private void delete() {
		System.out.print("삭제할 글의 인덱스 번호를 알려주세요");
		
		int index = inputInteger();
		
		if (!dao.isValidIndex(index)) {
			System.out.println("인덱스 번호를 확인하세요");
			delete();
			return;
		}
		
		int result = dao.delete(index);
		
		if (result == 0) {
			System.out.println("삭제 실패");
			return;
		}
		System.out.println("삭제 성공");		
	}


	private void update() {
		System.out.print("수정할 글의 인덱스 번호를 입력하세요");
		
		int index = inputInteger();
		
		if (!dao.isValidIndex(index)) {
			System.out.println("인덱스 번호를 확인하세요");
			update();
			return;
		}
			
		System.out.println("제목을 입력해주세요");
		String title = sc.nextLine();
		System.out.println("내용을 입력해주세요");
		String content = sc.nextLine();
		System.out.println("작성자를 입력해주세요");
		String author = sc.nextLine();
		
		postModel model = new postModel(index, title, content, author, null, null);
		int result = dao.update(model, index);
		
		if (result == 0) {
			System.out.println("수정 실패");
			return;
		}
		System.out.println("수정 성공");
	}


	private void showAt() {
		System.out.println("찾는 글의 인덱스 번호를 입력하세요");
		
		int index = inputInteger();
		
		if (!dao.isValidIndex(index)) {
			System.out.println("인덱스 번호를 확인하세요");
			showAt();
			return;
		}
		
		dao.viewAt(index);		
	}


	private void showList() {
		System.out.println("----- 글 목록 -----");
		dao.viewAll();
	}


	private void write() {
		if (!dao.isMemoryAvailable()) {
			System.out.println("저장 공간이 부족합니다.");
			return;
		}
		
		System.out.println("----- 글 작성하기 -----");
		System.out.println("제목을 입력해주세요");
		String title = sc.nextLine();
		System.out.println("내용을 입력해주세요");
		String content = sc.nextLine();
		System.out.println("작성자를 입력해주세요");
		String author = sc.nextLine();
		
		postModel model = new postModel(0, title, content, author, null, null);
		int result = dao.saveWriting(model);
		
		if (result == 0) {
			System.out.println("글 저장을 실패했습니다.");
			return;
		}
		System.out.println("글 저장을 성공했습니다.");
	}


	private int showMainMenu() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("[0]종료 [1]글쓰기 [2]목록보기 [3]글 보기 [4]글 수정하기 [5]글 삭제하기");
		System.out.println("-------------------------------------------------------------------\n");
		
		System.out.print("사용할 기능의 번호를 입력해주세요.");
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
