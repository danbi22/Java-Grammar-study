package recorderController;

import java.util.List;

import recorderModel.Recorder;

public interface RecorderDao {
	
	
	/**
	 * 새로운 recorder 저장
	 * @param recorder 객체를 받아 DB에 저장
	 * @return 저장한 행의 개수를 리턴
	 */
	int create(Recorder recorder);
	
	/**
	 * 모든 기록을 읽음
	 * @return 읽은 리스트를 리턴
	 */
	List<Recorder> read();
	
	/**
	 * primary key에 해당하는 연락처 정보를 수정(업데이트)
	 * @param recorder pk(id)
	 * @return 업데이트된 행의 개수를 리턴
	 */
	int update(Recorder recorder);
	
	/**
	 * 선택된 행을 삭제
	 * @param id 삭제할 id
	 * @return 삭제된 행의 개수를 리턴
	 */
	int delete(Integer id);	
}