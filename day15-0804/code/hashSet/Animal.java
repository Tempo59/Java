package hashSet;

public class Animal {
	
	private String name;
	private int age;
	private char sex;
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Animal) {
			Animal a = (Animal) obj;
			if(this.name.equals(a.name)
					&&this.age==a.age
					&&this.sex==a.sex) {
				return true;
			}
		}
		return false;
//		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		return sex + age;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", sex=" + sex + "]";
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
	public Animal() {
		super();
	}
	public Animal(String name, int age, char sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

}
