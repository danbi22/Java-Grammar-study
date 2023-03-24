package logUp;

public class LogUpModel {
	// field
	private String id;
	private String password;
	private String name;
	private String phone;
	private String birth;
	private String sex;
	
	
	// constructor
	public LogUpModel() {}

	public LogUpModel(String id, String password, String name, String phone, String birth, String sex) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.birth = birth;
		this.sex = sex;
	}

	
	// method
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}
	
	
	
	
}
