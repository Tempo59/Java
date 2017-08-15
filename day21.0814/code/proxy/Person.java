package proxy;

public class Person implements RentHouse {
	
	String name = "房东";

	@Override
	public void rent() {
		System.out.println(name+"出租房屋");
	}

}
