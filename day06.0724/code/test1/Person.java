package test1;

public class Person {
	//��ĳ�Ա����
	String name;
	int age;
	int id;
	
	//�������췽��
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
	
	//��Ϊ����
	public void eat(String food) {
		System.out.println(name+"ϲ����"+food);
	}
	
	public static void main(String[] args) {
		Person p = new Person("Tom", 12);
		Person p1 = new Person();
//		p.age = 12;
//		p.name = "Tom";
		System.out.println(p.age);
		System.out.println(p.name);
		System.out.println(p1.name);
//		p.eat("�׷�");
	}

}




