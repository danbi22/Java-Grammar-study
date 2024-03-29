package recorderModel;

public class Recorder {
	public interface Entity{
		String TBL_NAME = "recorder";
		String COL_ID = "id";
		String COL_NAME = "name";
		String COL_INIT = "initialValue";
		String COL_GROW = "growthRate";
		String COL_FIN = "finalValue";
		String COL_MEMO = "memo";
	}
	
	// field
	private int id;
	private String name;
	private double initialValue;
	private double growthRate;
	private double finalValue;
	private String memo;
	
	// constructor
	public Recorder() {}

	public Recorder(String name, double initialValue, double finalValue, String memo) {
		this.name = name;
		this.initialValue = initialValue;
		this.growthRate = (finalValue - initialValue) / initialValue * 100;
		this.finalValue = finalValue;
		this.memo = memo;
	}
	
	public Recorder(int id, String name, double initialValue, double growthRate, double finalValue, String memo) {
		this.id = id;
		this.name = name;
		this.initialValue = initialValue;
		this.finalValue = finalValue;
		this.growthRate = growthRate;
		this.memo = memo;
	}


	// method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getInitialValue() {
		return initialValue;
	}

	public void setInitialValue(double initialValue) {
		this.initialValue = initialValue;
	}

	public double getFinalValue() {
		return finalValue;
	}

	public void setFinalValue(double finalValue) {
		this.finalValue = finalValue;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getGrowthRate() {
		return growthRate;
	}

	public void setGrowthRate(double growthRate) {
		this.growthRate = growthRate;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	
	
}