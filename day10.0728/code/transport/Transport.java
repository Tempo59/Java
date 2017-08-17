package transport;

public class Transport {
	
	protected String name;
	
	public void transport(String s) {
		System.out.println("‘À ‰"+s);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Transport(String name) {
		super();
		this.name = name;
	}

	public Transport() {
		super();
	}

}
