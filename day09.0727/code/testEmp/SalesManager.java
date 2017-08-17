package testEmp;

public class SalesManager extends Employee {
	
	private SalesMan[] salesMans;
	private double bonus;
	private double monthlyPay;
	public SalesManager() {
		super();
	}
	public SalesManager(String name, int id, double monthlyPay, double bonus, SalesMan...salesMans) {
		super(name, id);
		this.salesMans = salesMans;
		this.bonus = bonus;
		this.monthlyPay = monthlyPay;
		this.sal = this.monthlyPay + getAllSales() * this.bonus;
		this.grade = getGrade();
	}
	
	//获取销售总额
	public int getAllSales() {
		int sales = 0;
		for(SalesMan s:salesMans) {
			sales += s.getSales();
		}
		return sales;
	}
	public SalesMan[] getSalesMans() {
		return salesMans;
	}
	public void setSalesMans(SalesMan[] salesMans) {
		this.salesMans = salesMans;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getMonthlyPay() {
		return monthlyPay;
	}
	public void setMonthlyPay(double monthlyPay) {
		this.monthlyPay = monthlyPay;
	}
	
}





