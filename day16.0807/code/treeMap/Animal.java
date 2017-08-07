package treeMap;

public class Animal implements Comparable<Animal> {
	
	private String name;

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal() {
		super();
	}

	public Animal(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(Animal o) {
		return this.name.compareTo(o.name);
	}

}
