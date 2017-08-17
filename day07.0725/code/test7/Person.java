package test7;

public class Person {
	
	private String name;
	private int age;
	private char sex;
	private int id;
	
	
	public Person(String name, int age, char sex, int id) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.id = id;
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
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
