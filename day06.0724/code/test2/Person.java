public class Person {
	String name;
	public Person(){}
	public Person(String a){
		
	name = a;
	}
	public   void fun(Parker n,Dog ba) {
		
		System.out.println(name + "��" + n.name + "��" + ba.name);
	}
	public static void main(String[]args) {
		Person mei=new Person("С��");
		Parker par=new Parker("����");
		Dog  gou=new Dog("����");
		mei.fun(par,gou);
		
	}
}
class Parker{
	String name;
	public Parker(){}
	public Parker(String b){
	name = b;
	}
}
class Dog{
	String name;
	public Dog(){}
	public Dog(String c){
	name = c;	
	}
}