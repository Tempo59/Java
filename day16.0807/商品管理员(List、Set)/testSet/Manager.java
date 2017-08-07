package testSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

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
	public void addGood(Set<Good> set, Good good) {
		int size = set.size();
		set.add(good);
		if(size<set.size()) {
			System.out.println("添加成功");
		}else {
			System.out.println("已有此商品，添加失败");
		}
	}

	@Override
	public void deleteById(Set<Good> set, int id) {
		int size1 = set.size();
		Iterator<Good> it = set.iterator();
		while(it.hasNext()) {
			if(it.next().getId()==id) {
				it.remove();
			}
		}
		if(size1>set.size()) {
			System.out.println("删除成功！");
		}else {
			System.out.println("没有要删除的商品，删除失败！");
		}
	}

	@Override
	public void deleteByName(Set<Good> set, String name) {
		int size1 = set.size();
		Iterator<Good> it = set.iterator();
		while(it.hasNext()) {
			if(it.next().getName().equals(name)) {
				it.remove();
			}
		}
		if(size1>set.size()) {
			System.out.println("删除成功！");
		}else {
			System.out.println("没有要删除的商品，删除失败！");
		}
	}

	@Override
	public void setPriceBySales(Set<Good> set, int sales, double newPrice) {
		Iterator<Good> it = set.iterator();
		while(it.hasNext()) {
			Good good = it.next();//将迭代出的商品对象存储到good对象中
			if(good.getSales()==sales) {//若是要修改的商品
				it.remove();//先删除原对象
				good.setPriceOne(newPrice);//将good中要修改的属性修改
				set.add(good);//在将修改后的good添加到集合中
			}
		}
	}

	@Override
	public void setPriceByCost(Set<Good> set, double cost, double newPriceAll) {
		Iterator<Good> it = set.iterator();
		while(it.hasNext()) {
			Good good = it.next();//将迭代出的商品对象存储到good对象中
			if(good.getSales()==cost) {//若是要修改的商品
				it.remove();//先删除原对象
				good.setPriceOne(newPriceAll);//将good中要修改的属性修改
				set.add(good);//在将修改后的good添加到集合中
			}
		}
	}

	@Override
	public Set<Good> queryByPriceOne(Set<Good> set, double priceOne) {
		TreeSet<Good> s = new TreeSet<>();
		Iterator<Good> it = set.iterator();
		while(it.hasNext()) {
			Good g = it.next();
			if(g.getPriceOne()>=priceOne) {
				s.add(g);
			}
		}
		return s;
	}

	@Override
	public Set<Good> queryByPriceAll(Set<Good> set, double priceAll) {
		TreeSet<Good> s = new TreeSet<>();
		Iterator<Good> it = set.iterator();
		while(it.hasNext()) {
			Good g = it.next();
			if(g.getPriceOne()<priceAll) {
				s.add(g);
			}
		}
		return s;
	}

	@Override
	public void allQuery(Set<Good> set) {
		Iterator<Good> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
