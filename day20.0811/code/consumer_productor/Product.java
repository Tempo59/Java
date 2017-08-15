package consumer_productor;

public class Product {
	
	private String name;
	private int id;
	public void setName(String name) {
		this.name = name;
		this.id++;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + "]";
	}
	public Product() {
		super();
	}

}
