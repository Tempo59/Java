package test2;

public class Person {
	
	private String name;
	private int age;
	
	public void eat(String food) {
		System.out.println(name+"��"+food);
	}
	
	public void study(String subject) {
		eat("�׷�");
		System.out.println(name+"����ѧϰ"+subject);
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






