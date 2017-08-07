package maphomework;

public class Person {
	
	private String name;
	private int age;
	private char sex;
	private double grade;
	public Person(String name, int age, char sex, double grade) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.grade = grade;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + ", grade=" + grade + "]";
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
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	@Override
	public int hashCode() {
		return age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p=(Person)obj;
			if(this.name.equals(p.getName())&&this.age==p.getAge()&&
					this.sex==p.getSex()&&this.grade==p.getGrade()) {
				return true;
			}
		}
		return false;
	}

}
