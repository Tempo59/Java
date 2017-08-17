package test1;

public class Dog extends Animal {
	//从父类继承来的name和age属性
	//从父类继承来的eat方法
	
	String kind;
	
	public Dog() {}
	public Dog(String kind) {
		this.kind = kind;
	}
	public Dog(String name,int age,String kind) {
		this.name = name;
		this.age = age;
		this.kind = kind;
	}
	
	public void bit(String name) {
		System.out.println(this.name+"咬"+name);
	}
}
