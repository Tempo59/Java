package test1;

public class Animal {
	
	String name;
	int age;
	
	public Animal() {}
	public Animal(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void eat(String food) {
		System.out.println(name+"³Ô"+food);
	}

}
