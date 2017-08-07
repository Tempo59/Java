package treeMap;

import java.util.Comparator;

public class Person implements Comparator<Person> {
	
	public Person() {
		super();
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	private String name;

	@Override
	public int compare(Person o1, Person o2) {
		return o2.name.compareTo(o1.name);
	}

	

}
