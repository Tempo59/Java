package arrayList;

import java.util.ArrayList;

public class Test3 {
	
	public static void main(String[] args) {
		
//		ArrayList<Person> l = new ArrayList<>();
//		Person p = new Person("Tom");
//		l.add(p);
//		l.add(p);
//		l.add(p);
//		l.add(p);
//		l.add(p);
//		System.out.println(l.size());
//		l.remove(4);
//		System.out.println(l.size());
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(88);
//		System.out.println(list.size());
//		list.remove(new Integer(88));
//		System.out.println(list.get(1));
		System.out.println(list.get(3));
		list.set(3, 99);
		System.out.println(list.get(3));
		
		Object[] objs = list.toArray();
		for(Object o:objs) {
			Integer i = (Integer) o;
			System.out.println(i);
		}
		
	}

}





