package edu.java.lambda03;

public class Employee {
	// field
	private Integer empId; // 사번
	private String empName; // 이름
	private String dept; // 부서이름
	private String emptitie; // 직급(사원, 대리, 과장, ...)
	private Double salary; // 급여
	
	// constructor
	public Employee(Integer empId, String empName, String dept, String emptitie, Double salary) {
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
		this.emptitie = emptitie;
		this.salary = salary;
	}

	// getters & setters method
	public Integer getEmpId() {
		return empId;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public String getEmptitie() {
		return emptitie;
	}


	public void setEmptitie(String emptitie) {
		this.emptitie = emptitie;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return String.format("Employee(Id=%d, name=%s, dept=%s, title=%s, salary=%.1f)\n", empId, empName, dept, emptitie, salary);
	}
}
