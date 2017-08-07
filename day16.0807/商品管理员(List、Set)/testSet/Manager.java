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
			System.out.println("��ӳɹ�");
		}else {
			System.out.println("���д���Ʒ�����ʧ��");
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
			System.out.println("ɾ���ɹ���");
		}else {
			System.out.println("û��Ҫɾ������Ʒ��ɾ��ʧ�ܣ�");
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
			System.out.println("ɾ���ɹ���");
		}else {
			System.out.println("û��Ҫɾ������Ʒ��ɾ��ʧ�ܣ�");
		}
	}

	@Override
	public void setPriceBySales(Set<Good> set, int sales, double newPrice) {
		Iterator<Good> it = set.iterator();
		while(it.hasNext()) {
			Good good = it.next();//������������Ʒ����洢��good������
			if(good.getSales()==sales) {//����Ҫ�޸ĵ���Ʒ
				it.remove();//��ɾ��ԭ����
				good.setPriceOne(newPrice);//��good��Ҫ�޸ĵ������޸�
				set.add(good);//�ڽ��޸ĺ��good��ӵ�������
			}
		}
	}

	@Override
	public void setPriceByCost(Set<Good> set, double cost, double newPriceAll) {
		Iterator<Good> it = set.iterator();
		while(it.hasNext()) {
			Good good = it.next();//������������Ʒ����洢��good������
			if(good.getSales()==cost) {//����Ҫ�޸ĵ���Ʒ
				it.remove();//��ɾ��ԭ����
				good.setPriceOne(newPriceAll);//��good��Ҫ�޸ĵ������޸�
				set.add(good);//�ڽ��޸ĺ��good��ӵ�������
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
