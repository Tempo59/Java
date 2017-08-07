package testList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager implements Operation {
	
	private String name;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Manager() {
		super();
	}

	public Manager(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	@Override
	public void addGood(List<Good> list, Good good) {
		list.add(good);
		System.out.println("添加成功！");
	}

	@Override
	public void deleteById(List<Good> list, int id) {
		int size1 = list.size();
		Iterator<Good> it = list.iterator();
		while(it.hasNext()) {
			if(it.next().getId()==id) {
				it.remove();
			}
		}
		if(size1>list.size()) {
			System.out.println("删除成功！");
		}else {
			System.out.println("没有要删除的商品，删除失败！");
		}
	}

	@Override
	public void deleteByName(List<Good> list, String name) {
		int size1 = list.size();
		Iterator<Good> it = list.iterator();
		while(it.hasNext()) {
			if(it.next().getName().equals(name)) {
				it.remove();
			}
		}
		if(size1>list.size()) {
			System.out.println("删除成功！");
		}else {
			System.out.println("没有要删除的商品，删除失败！");
		}
	}

	@Override
	public void setPriceBySales(List<Good> list, int sales, double newPrice) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getSales()==sales) {
				list.get(i).setPriceOne(newPrice);
			}
		}
	}

	@Override
	public void setPriceByCost(List<Good> list, double cost, double newPriceAll) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getCost()==cost) {
				list.get(i).setPriceAll(newPriceAll);
			}
		}
	}

	@Override
	public List<Good> queryByPriceOne(List<Good> list, double priceOne) {
		ArrayList<Good> l = new ArrayList<>();
		Iterator<Good> it = list.iterator();
		while(it.hasNext()) {
			Good g = it.next();
			if(g.getPriceOne()==priceOne) {
				l.add(g);
			}
		}
		return l;
	}

	@Override
	public List<Good> queryByPriceAll(List<Good> list, double priceAll) {
		ArrayList<Good> l = new ArrayList<>();
		Iterator<Good> it = list.iterator();
		while(it.hasNext()) {
			Good g = it.next();
			if(g.getPriceAll()==priceAll) {
				l.add(g);
			}
		}
		return l;
	}

	@Override
	public void queryAll(List<Good> list) {
		Iterator<Good> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
