package testEmp;

public class SalesMan extends Employee {

	private double bonus;
	private int sales;
	public SalesMan() {
		super();
	}
	public SalesMan(String name, int id, int sales, double bonus) {
		super(name, id);
		this.sales = sales;
		this.bonus = bonus;
		this.sal = this.sales * this.bonus;
		this.grade = this.getGrade();
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
		this.sal = this.sales * this.bonus;
		this.grade = getGrade();
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
		this.sal = this.sales * this.bonus;
		this.grade = getGrade();
	}
	
}

