package test3;

public class Dog extends Animal {
	
	int a = 5;
	
	public void fun1() {
		System.out.println(this.a);
		System.out.println(super.a);
	}
	
	private String kind;

	public Dog() {}

	public Dog(String name, int age, String kind) {
		this.name = name;
		this.age = age;
		this.kind = kind;
	}
	
//	@Override
//	public void eat(String food) {
//		System.out.println("名字是"+name
//				+"的"+kind+"吃"+food);
//	}
	
	public void fun() {
		System.out.println("fun方法");
	}
	

}




