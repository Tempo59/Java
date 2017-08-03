package day13homework;

public class Fish extends Animal {
	
	public static int number=0;
	public Fish(int number) {
		Fish.number=number;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		Fish.number = number;
	}

	
}
