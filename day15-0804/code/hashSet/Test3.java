package hashSet;

import java.util.HashSet;

public class Test3 {
	
	public static void main(String[] args) {
		
		HashSet<Person> set = new HashSet<>();
		Person p1 = new Person("��ʩ", 12);
		Person p2 = new Person("����", 13);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		set.add(p1);
		set.add(p2);
		System.out.println(set.size());
		
	}

}
