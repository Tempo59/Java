package Improve;

import java.util.Iterator;
import java.util.TreeSet;

public class Test {
	
	public static void main(String[] args) {
		TreeSet<Good> ts=new TreeSet<>();
		Good g1=new Good(1,"�ɿ���",2.0,3.0,4.0,100,"�¹�");
		Good g2=new Good(2,"�ɿ���+",2.0,3.0,4.0,150,"�¹�");
		Good g3=new Good(3,"�ɿ���*",2.0,3.0,4.0,300,"�¹�");
		ts.add(g1);
		ts.add(g2);
		ts.add(g3);
		GoodManager gm=new GoodManager();
		System.out.println(ts.size());
		gm.deleteById(ts, 1);
		System.out.println(ts.size());
		Iterator<Good> it=ts.iterator();
		while(it.hasNext()) {
		System.out.println(it.next().toString());
		}
		gm.setPriceByName(ts, 150, 8.0);
		Iterator<Good> it2=ts.iterator();
		while(it2.hasNext()) {
		System.out.println(it2.next().toString());
		}
	}

}
