package post02;

public interface postDao {
	
	/**
	 * 글을 저장하는 메서드, 첫 작성 시간도 함께 저장됨
	 * @param PostModel 
	 * @return int 글저장을 성공하면 1을 리턴, 실패하면 0을 리턴
	 */
	int saveWriting(PostModel model);
	
	/**
	 * 글 목록(제목)을 불러오는 메서드
	 */
	void viewAll();
	
	/**
	 * 글을 선택하고 보여줌
	 * @param int index
	 */
	void viewAt(int index);
	
	/**
	 * 수정 전 글을 보여주고 글을 수정한 뒤 수정 시간을 저장함
	 * @param PostModel model
	 * @param int index
	 * @return int 글 수정이 성공하면 1을 리턴, 실패하면 0을 리턴
	 */
	int update(PostModel model, int index);
	
	/**
	 * 글을 삭제하는 기능
	 * @param int index
	 * @ruturn 삭제 성공하면 1을 리턴, 실패하면 0을 리턴
	 */
	int delete(int index);
}