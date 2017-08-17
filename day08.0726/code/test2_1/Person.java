package test2_1;

public class Person {
	
	public char sex;
	protected String name;
	int age;
	private double salary;
	
	public void display() {
		System.out.println("我叫"+name
				+"，我是"+sex+"的，我今年"
				+age+"岁了，我的工资是"+salary);
	}
	
	public Person() {}
	public Person(char sex,
			String name,int age,double salary) {
		this.sex = sex;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
