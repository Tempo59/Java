package linkedHashSet;

public class Good {
	
	//设计一个商品类，有商品名称，进价，产地，售价属性
	//重写equals方法和hashCode法
	//将5个商品对象添加到一个LinkedHashSet集合中
	//实现排重功能，使用迭代器遍历
	private String name;
	private int cost;
	private String place;
	private int price;
	@Override
	public String toString() {
		return "Good [name=" + name + ", cost=" + cost + ", place=" + place + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return cost + price;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Good) {
			Good g = (Good) obj;
			if(this.name.equals(g.name)
					&&this.cost==g.cost
					&&this.place.equals(g.place)
					&&this.price==g.price) {
				return true;
			}
		}
		return false;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Good() {
		super();
	}
	public Good(String name, int cost, String place, int price) {
		super();
		this.name = name;
		this.cost = cost;
		this.place = place;
		this.price = price;
	}

}
