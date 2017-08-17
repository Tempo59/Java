package no_name;

public class Test1 {
	
	public static void main(String[] args) {
		
		int i = new Person() {
			int age;
			public int getAge() {
				return age;
			}
		}.getAge();
		
		
		
	}

}
