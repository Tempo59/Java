package constructor;

public class Animal {
	
	public String name;
	public int age;
	public Animal() {
		super();
	}
	private Animal(int age) {
		super();
		this.age = age;
	}
	Animal(String name) {
		super();
		this.name = name;
	}
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}

}
