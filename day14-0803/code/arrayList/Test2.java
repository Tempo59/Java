package arrayList;

import java.util.ArrayList;

public class Test2 {
	
	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<>();
		
		Person p = new Person("Tom");
		
		list.add(p);
		
		System.out.println(list.contains(p));
		
		ArrayList<String> l = new ArrayList<>();
		l.add("Tom");
		System.out.println(l.contains("Tom"));
		
	}

}
