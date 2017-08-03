package day14homework;

//商品类
public class Good3 {
  //编号,名称,进价,零售价,批发价,销量,产地等成员属性
	public int id;
	public String name;
	public double cost;
	public double priceOne;
	public double priceAll;
	public int sales;
	public String place;
	//构造函数及相关属性的get/set方法
	public Good3(int id, String name, double cost, double priceOne, double priceAll, int sales, String place) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.priceOne = priceOne;
		this.priceAll = priceAll;
		this.sales = sales;
		this.place = place;
	}
	public Good3() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getPriceOne() {
		return priceOne;
	}
	public void setPriceOne(double priceOne) {
		this.priceOne = priceOne;
	}
	public double getPriceAll() {
		return priceAll;
	}
	public void setPriceAll(double priceAll) {
		this.priceAll = priceAll;
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
}
