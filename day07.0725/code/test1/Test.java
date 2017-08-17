package test1;

public class Test {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		System.out.println(p.getName());
//		p.name = "Tom";
		p.setName("Tom");
		System.out.println(p.getName());
//		System.out.println(p.name);
		
	}

}
