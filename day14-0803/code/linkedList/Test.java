package linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Test {
	
	public static void main(String[] args) {
		
		LinkedList<String> l = new LinkedList<>();
		l.add("����");
		l.add("����");
		l.addFirst("Tom");
		l.add(0, "�ܴ�");
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
//		ListIterator<String> lit = l.listIterator();
//		while(lit.hasNext()) {
//			System.out.println(lit.next());
//		}
		
	}

}
