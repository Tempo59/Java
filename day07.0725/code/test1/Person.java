package test1;

public class Person {
	
	private String name;
	int age;
	
	public void setName(String str) {
		name = str;
	}
	
	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		
		Person p = new Person();
		System.out.println(p.name);
		p.name = "Tom";
		System.out.println(p.name);
		
	}

}
