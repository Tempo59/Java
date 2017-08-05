package Improve;

import java.util.Iterator;
import java.util.TreeSet;

public class Test {
	
	public static void main(String[] args) {
		TreeSet<Good> ts=new TreeSet<>();
		Good g1=new Good(1,"巧克力",2.0,3.0,4.0,100,"德国");
		Good g2=new Good(2,"巧克力+",2.0,3.0,4.0,150,"德国");
		Good g3=new Good(3,"巧克力*",2.0,3.0,4.0,300,"德国");
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
