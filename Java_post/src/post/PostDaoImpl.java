package post;

import java.time.LocalDateTime;

public class PostDaoImpl implements postDao {
	// singleton step 1
	// private로 숨기고 static메모리에 띄운 PostDaoImpl 타입의 instance라는 참조변수생성 null로 초기화
	private static PostDaoImpl instance = null;
	
	// singleton step 2
	// private로 숨긴 기본생성자 생성 다른 곳에서 생성 불가능.
	private PostDaoImpl() {}
	
	// singleton step 3
	// 어디서든 이 메서드 만을 이용해서 객체를 생성할 수 있으나
	// 한번 객체가 생성되면 다른 객체를 생성되지 않고 생성된 객체를 불러와 준다.
	public static PostDaoImpl getInstance() {
		if (instance == null) {
			instance = new PostDaoImpl();
		}
		return instance;
	}
	
	
	
	//field
	int MAX_LENGTH = 5;
	postModel[] postArray = new postModel[MAX_LENGTH];
	int count = 0;
	
	
	@Override
	public int saveWriting(postModel p) {
		if (isMemoryAvailable()) {
			postArray[count] = p;
			LocalDateTime now = LocalDateTime.now();
			postArray[count].setCreatedTime(now);
			count++;
			return 1;
		}
		return 0;
	}
	@Override
	public void viewAll() {
		for (int i = 0; i < count; i++) {
			System.out.println(postArray[i]);
		}
		
	}
	@Override
	public void viewAt(int index) {
		System.out.println(postArray[index]);
	}
	@Override
	public int update(postModel model, int index) {
		if (!isValidIndex(index)) {
			return 0;
		}
			
		LocalDateTime now = LocalDateTime.now();
		postArray[index].setTitle(model.getTitle());
		postArray[index].setContent(model.getContent());
		postArray[index].setAuthor(model.getAuthor());
		postArray[index].setModifiedTime(now);
			
		return 1;
	}
	@Override
	public int delete(int index) {
		if (!isValidIndex(index)) {
			return 0;
		}
		for (int i = index; i < count - 1; i++) {
			postArray[i] = postArray[i+1];
			
		}
		postArray[count - 1] = null;
		count--;
		
		return 1;
	}
	
	/**
	 * 포스트 배열에 새로운 post 객체를 저장할 수 있는 지를 리턴
	 * @return 배열에 빈 공간이 있으면 true, 그렇지 않으면 false를 리턴
	 */
	public boolean isMemoryAvailable() {
		return count < MAX_LENGTH;
	}
	
	/**
	 * 어떤 인덱스가 검색, 수정, 삭제할 때 사용 가능한 범위 안에 있는 인덱스인 지를 리턴
	 * @param index  유효한 인덱스인 지 검사할 인덱스
	 * @return 사용가능한 인덱스는 true, 그렇지 않으면 false  
	 */
	public boolean isValidIndex(int index) {
		return index >= 0 && index < count;
	}
}
