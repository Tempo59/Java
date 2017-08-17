public class Person {
	String name;
	public Person(){}
	public Person(String a){
		
	name = a;
	}
	public   void fun(Parker n,Dog ba) {
		
		System.out.println(name + "在" + n.name + "遛" + ba.name);
	}
	public static void main(String[]args) {
		Person mei=new Person("小美");
		Parker par=new Parker("朝阳");
		Dog  gou=new Dog("旺财");
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