package testFruit;

public class Fruit {
	
	protected String name;
	protected String place;
	
	//解渴
	public void fun() {
		System.out.println(name+"可以解渴");
	}
	
	public Fruit(String name, String place) {
		super();
		this.name = name;
		this.place = place;
	}
	public Fruit() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	

}
