package test3;

public class Animal {
	
	int a = 2;
	
	public void eat(String food) {
		System.out.println("³Ô"+food);
	}
	
	protected String name;
	protected int age;
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Animal() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
