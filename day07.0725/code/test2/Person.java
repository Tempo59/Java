package test2;

public class Person {
	
	private String name;
	private int age;
	
	public void eat(String food) {
		System.out.println(name+"吃"+food);
	}
	
	public void study(String subject) {
		eat("米饭");
		System.out.println(name+"正在学习"+subject);
	}
	
	public Person() {}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}






