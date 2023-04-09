package post2;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class PostDaoImpl implements postDao {
	// field
		List<PostModel> posts = new LinkedList<>();
		
	// singleton step 1
	// private로 숨기고 static메모리에 띄운 PostDaoImpl 타입의 instance라는 참조변수생성 null로 초기화
	private static PostDaoImpl instance = null;
	
	// singleton step 2
	// private로 숨긴 기본생성자 생성 다른 곳에서 생성 불가능.
	private PostDaoImpl() {
		PostFile.makeFolder();
		PostFile.makeFile();
		posts = PostFile.readFile();
	}
	
	// singleton step 3
	// 어디서든 이 메서드 만을 이용해서 객체를 생성할 수 있으나
	// 한번 객체가 생성되면 다른 객체를 생성되지 않고 생성된 객체를 불러와 준다.
	public static PostDaoImpl getInstance() {
		if (instance == null) {
			instance = new PostDaoImpl();
		}
		return instance;
	}

	
	
	

	
	//	method
	@Override
	public int saveWriting(PostModel p) {
		LocalDateTime now = LocalDateTime.now();
		p.setCreatedTime(now);
	
		posts.add(p);
		PostFile.writeToFile(posts);
	
		return 1;
	}
	
	@Override
	public void viewAll() {
		for (PostModel p : posts)
		System.out.println(posts);
	}
	
	@Override
	public void viewAt(int index) {
		System.out.println(posts.get(index));
	}
	
	@Override
	public int update(PostModel model, int index) {
		if (!isValidIndex(index)) {
			return 0;
		}
			
		LocalDateTime now = LocalDateTime.now();
		model.setModifiedTime(now);
		
		posts.add(index, model);
		PostFile.writeToFile(posts);
		
		return 1;
	}
	
	@Override
	public int delete(int index) {
		if (!isValidIndex(index)) {
			return 0;
		}
		posts.remove(index);
		PostFile.writeToFile(posts);
		
		return 1;
	}
	
	/**
	 * 어떤 인덱스가 검색, 수정, 삭제할 때 사용 가능한 범위 안에 있는 인덱스인 지를 리턴
	 * @param index  유효한 인덱스인 지 검사할 인덱스
	 * @return 사용가능한 인덱스는 true, 그렇지 않으면 false  
	 */
	public boolean isValidIndex(int index) {
		return index >= 0 && index < posts.size();
	}
}