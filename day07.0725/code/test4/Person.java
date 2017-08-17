package test4;

public class Person {
	
	static final int a = 1;
	
//	static {
//		a = 1;
//	}
	
	static int num = 0;
	
	int id;
	
//	{
//		id = ++num;
//	}
	
	public Person() {
		id = ++num;
	}

}
