package test1;

public class Test {
	
	public static void main(String[] args) {
		
		//对象自动转型：从子类Dog转向父类Animal
		Animal a = new Dog();
//		System.out.println(a);
		Cat d = (Cat) a;
//		System.out.println(d);
		
	}

}
