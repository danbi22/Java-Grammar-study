package recorderController;

import recorderModel.Recorder;

public interface RecorderDao {
	
	/**
	 * recoder를 생성하는 메서드
	 * @return
	 */
	int create(Recorder recorder);
	
	
	void read();
}