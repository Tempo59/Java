package Improve;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class GoodManager implements Operation{

	@Override
	public void addGood(Set<Good> set, Good good) {
		// TODO Auto-generated method stub
		set.add(good);
	}

	@Override
	public void deleteById(Set<Good> set, int id) {
		// TODO Auto-generated method stub
		
		Iterator<Good> it=set.iterator();
		while(it.hasNext()) {
			if(it.next().getId()==id) {
				it.remove();
				
	    		}
		}
	}

	@Override
	public void deleteByName(Set<Good> set, String name) {
		// TODO Auto-generated method stub
		Iterator<Good> it=set.iterator();
		while(it.hasNext()) {
			if(it.next().getName()==name) {
				it.remove();
				
	    		}
		}
	}

	@Override
	public void setPriceByName(Set<Good> set, int sales, double newPrice) {
		// TODO Auto-generated method stub
		for(Good goo : set)
			if(goo.getSales() == sales) {
				Good g=goo;
				g.setPriceOne(newPrice);
			}
				
	}

	@Override
	public void setPriceByCost(Set<Good> set, double cost, double newPriceAll) {
		// TODO Auto-generated method stub
		for(Good goo : set)
			if(goo.getCost() == cost) {
				Good g=goo;
				g.setPriceAll(newPriceAll);
			}
	}

	@Override
	public Set<Good> queryByPriceOne(Set<Good> set, double priceOne) {
		// TODO Auto-generated method stub
	    TreeSet<Good> ts=new TreeSet<>();
	    for(Good goo:set) {
	    	if(goo.getPriceOne()>priceOne) {
	    		ts.add(goo);
	    	}
	    }
	    return ts;
	}

	@Override
	public Set<Good> queryByPriceAll(Set<Good> set, double priceAll) {
		// TODO Auto-generated method stub
		TreeSet<Good> ts=new TreeSet<>();
	    for(Good goo:set) {
	    	if(goo.getPriceAll()<priceAll) {
	    		ts.add(goo);
	    	}
	    }
	    return ts;
	}

	@Override
	public void queryAll(Set<Good> set) {
		// TODO Auto-generated method stub
		for(Good goo:set) {
			System.out.println(goo.toString());
		}
	}

	@Override//和上面一样的,题意是原先是自然排序的，现在需要自定义排序?
	public void allQuery(Set<Good> set) {
		// TODO Auto-generated method stub
		for(Good goo:set) {
			System.out.println(goo.toString());
		}
	}

}
