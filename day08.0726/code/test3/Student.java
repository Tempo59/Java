package test3;

public class Student extends Person{

	public void fun() {
		System.out.println("student���fun����");
	}
	
	public Person getP() {
		return new Student();
	}
	
}
