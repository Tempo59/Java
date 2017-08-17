package test4;

public class Dog extends Animal {
	
	
	
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}

	String name;
	int age;
	char sex;
	
	public Dog() {}
	
	public Dog(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	
	public Dog(String name, int age, char sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	@Override
	public void eat(String food) {
		super.eat(food);
		System.out.println("子类中的方法");
	}

}
