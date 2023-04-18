package farmModel;

public class crop {
	private String name;
	private double levelPoint;
	
	public crop(String name, double levelPoint) {
		this.name = name;
		this.levelPoint = levelPoint;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLevelPoint() {
		return levelPoint;
	}

	public void setLevelPoint(double levelPoint) {
		this.levelPoint = levelPoint;
	}
	
}
