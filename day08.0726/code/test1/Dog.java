package test1;

public class Dog extends Animal {
	//�Ӹ���̳�����name��age����
	//�Ӹ���̳�����eat����
	
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
		System.out.println(this.name+"ҧ"+name);
	}
}
