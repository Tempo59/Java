package test2_1;

public class Test {
	
	public static void main(String[] args) {
		
		Person p = new Person('Å®', "Ñî¹óåú", 12, 100);
		p.display();
		
		System.out.println(p.age);
		System.out.println(p.sex);
		System.out.println(p.name);
//		System.out.println(p.salary);
		
	}

}
