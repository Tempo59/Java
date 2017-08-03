package arrayList;

public class Person {
	
	private String name;
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Person) {
//			Person p = (Person) obj;
//			if(name.equals(p.name)){
//				return true;
//			}
//		}
//		return false;
//	}

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

}
