package testFruit;

public class Fruit {
	
	protected String name;
	protected String place;
	
	//���
	public void fun() {
		System.out.println(name+"���Խ��");
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
