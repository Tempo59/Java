package proxy;

public class Person implements RentHouse {
	
	String name = "����";

	@Override
	public void rent() {
		System.out.println(name+"���ⷿ��");
	}

}
