package testEmp;

public class Manager extends Employee {
	
	private double yearsPay;

	public Manager() {
		super();
	}

	public Manager(String name, int id, double yearsPay) {
		super(name, id);
		this.yearsPay = yearsPay;
		this.sal = this.yearsPay;
		this.grade = getGrade();
	}

	public double getYearsPay() {
		return yearsPay;
	}

	public void setYearsPay(double yearsPay) {
		this.yearsPay = yearsPay;
	}
	

}
