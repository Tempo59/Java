package test2_2;

import test2_1.Person;

public class Test {
	
	public static void main(String[] args) {
		
		Person p = new Person('ÄÐ', "Tom", 12, 100);
		System.out.println(p.sex);
//		System.out.println(p.name);
//		System.out.println(p.age);
//		System.out.println(p.salary);
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getSalary());
		
	}

}
