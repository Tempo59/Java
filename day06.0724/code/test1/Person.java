package test1;

public class Person {
	//类的成员变量
	String name;
	int age;
	int id;
	
	//声明构造方法
	public Person() {}
	public Person(String str,int i) {
		name = str;
		age = i;
	}
	public Person(String str) {
		name = str;
	}
	public Person(int i) {
		age = i;
	}
	
	//行为功能
	public void eat(String food) {
		System.out.println(name+"喜欢吃"+food);
	}
	
	public static void main(String[] args) {
		Person p = new Person("Tom", 12);
		Person p1 = new Person();
//		p.age = 12;
//		p.name = "Tom";
		System.out.println(p.age);
		System.out.println(p.name);
		System.out.println(p1.name);
//		p.eat("米饭");
	}

}




