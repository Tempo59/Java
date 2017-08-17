package testEmp;

public class Test {
	
	public static void main(String[] args) {
		
		Technology t1 = new Technology("уехЩ", 1001, 500, 25);
		t1.introduce();
		
		SalesMan s1 = new SalesMan("lisi", 1002, 100, 20);
		s1.introduce();
		
		SalesManager s2 = new SalesManager("Tom", 1003, 2000, 10, s1);
		s2.introduce();
		
		Manager m = new Manager("lkds", 1000, 200000);
		m.introduce();
		
	}

}
