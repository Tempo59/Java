package treeSet;

public class Person implements Comparable<Person> {
	
	private String name;
	public int age;

	@Override
	public String toString() {
		return "Person [name=" + name + "age="+age+"]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person() {
		super();
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(Person o) {
		if(!(this.name==null&&o.name==null)&&!this.name.equals(o.name)&&this.age==o.age) {
			return 1;
		}else {
			return this.age - o.age;
		}
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	

}
