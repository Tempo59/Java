package testSet;

public class Good implements Comparable<Good> {
	//���һ����Ʒ�࣬��Ʒ�б��(id),
	//����(name),����(cost),���ۼ�(priceOne),������(priceAll),����(sales),����(place)����
	private int id;
	private String name;
	private double cost;
	private double priceOne;
	private double priceAll;
	private int sales;
	private String place;
	public Good(int id, String name, double cost, double priceOne, double priceAll, int sales, String place) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.priceOne = priceOne;
		this.priceAll = priceAll;
		this.sales = sales;
		this.place = place;
	}
	public Good() {
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
	@Override
	public String toString() {
		return "Good [id=" + id + ", name=" + name + ", cost=" + cost + ", priceOne=" + priceOne + ", priceAll="
				+ priceAll + ", sales=" + sales + ", place=" + place + "]";
	}
	@Override
	public int compareTo(Good o) {
		//��ѯ������Ʒ/���������������۽������ۼ۽��򡢽��۽����������򡢱������
		if(o.sales!=this.sales) {
			return o.sales - this.sales;
		}else if(o.priceAll!=this.priceAll) {
			if(o.priceAll-this.priceAll>0) {
				return 1;
			}else {
				return -1;
			}
		}else if(o.priceOne!=this.priceOne) {
			if(o.priceOne-this.priceOne>0) {
				return 1;
			}else {
				return -1;
			}
		}else if(o.cost!=this.cost) {
			if(o.cost-this.cost>0) {
				return 1;
			}else {
				return -1;
			}
		}else if(!this.name.equals(o.name)) {
			return this.name.compareTo(o.name);
		}else if(this.id!=o.id) {
			return this.id - o.id;
		}else if(!this.place.equals(o.place)) {
			return 1;
		}else {
			return 0;
		}
	}
}


















