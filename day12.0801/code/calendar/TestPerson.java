package calendar;

public class TestPerson {
	
	public static void main(String[] args) {
		
		Person p = new Person("Tom", 12, 'f');
		
		System.out.println(p.NAME);
		System.out.println(p.get(Person.NAME));
		System.out.println(p.get(Person.AGE));
		System.out.println(p.get(Person.SEX));
		
		p.set(2, 13);
		System.out.println(p.get(2));
		
	}

}
