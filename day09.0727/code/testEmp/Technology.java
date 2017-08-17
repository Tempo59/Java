package testEmp;

public class Technology extends Employee {

	private double hourlyPay;
	private int hours;
	public Technology() {
		super();
	}
	public Technology(String name, int id, double hourlyPay, int hours) {
		super(name, id);
		this.hourlyPay = hourlyPay;
		this.hours = hours;
		this.sal = this.hourlyPay * this.hours;
		this.grade = this.getGrade();
	}
	public double getHourlyPay() {
		return hourlyPay;
	}
	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
		this.sal = this.hourlyPay * this.hours;
		this.grade = getGrade();
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
		this.sal = this.hourlyPay * this.hours;
		this.grade = getGrade();
	}
	
}
