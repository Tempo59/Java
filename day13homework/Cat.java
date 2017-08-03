package day13homework;

public class Cat extends Animal {

	public static int number=4;
	
	public Cat(int number) {
		super();
		Cat.number=number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		Cat.number = number;
	}
	
}
