package field;

public class Person {
	
	public String name;
	protected int age;
	char sex;
	private int id;
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + ", id=" + id + "]";
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
	public Person() {
		super();
	}
	public Person(String name, int age, char sex, int id) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.id = id;
	}

}
