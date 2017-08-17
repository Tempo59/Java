package test2;

public abstract class Person {
	
	protected String name;
	
//	public abstract void fun();

	public Person(String name) {
		super();
		this.name = name;
	}

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
