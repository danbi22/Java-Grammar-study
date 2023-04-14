package recorder01;

public interface RecorderDAO {
	
	/**
	 * recoder를 생성하는 메서드
	 * @return
	 */
	int create(Recorder recorder);
	
	
	void read();
}
