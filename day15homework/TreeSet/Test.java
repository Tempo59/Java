package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Test {
	
	public static void main(String[] args) {
		TreeSet<Employee> ts=new TreeSet<Employee>();
		Employee e1=new Employee(2,4,4.0);
		Employee e2=new Employee(2,3,4.0);
		Employee e3=new Employee(3,4,4.0);
		Employee e4=new Employee(3,3,4.0);
		Employee e5=new Employee(4,4,5.0);
		Employee e6=new Employee(4,4,6.0);
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		ts.add(e6);
		System.out.println(ts.size());
		Iterator<Employee> it=ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}

}
