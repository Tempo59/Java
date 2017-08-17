package test3;

public class Student extends Person{

	public void fun() {
		System.out.println("student类的fun方法");
	}
	
	public Person getP() {
		return new Student();
	}
	
}
