package day14homework;

public class Friend2 {
	
	public String name;
	public String number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Friend2(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}
	public Friend2() {
		super();
	}
	@Override
	public String toString() {
		return "Friend2 [name=" + name + ", number=" + number + "]";
	}
	
}
