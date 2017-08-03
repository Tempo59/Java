package day13homework;

public class Penguin extends Animal {

	public static int number=2;
	public Penguin(int number) {
		Penguin.number=number;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		Penguin.number = number;
	}
	
}

