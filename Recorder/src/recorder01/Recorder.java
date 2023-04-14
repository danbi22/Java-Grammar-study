package recorder01;

public class Recorder {
	public interface Entity{
		String COL_TABLE = "recoder";
		String COL_NAME = "name";
		String COL_INIT = "initialValue";
		String COL_FIN = "finalValue";
		String COL_GROW = "growthRate";
		String COL_MEMO = "memo";
	}
	
	// field
	private int id;
	private String name;
	private double initialValue;
	private double finalValue;
	private double growthRate;
	private String memo;
	
	// constructor
	public Recorder() {}

	public Recorder(String name, double initialValue, double finalValue, double growthRate, String memo) {
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
