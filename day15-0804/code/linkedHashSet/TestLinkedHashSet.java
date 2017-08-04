package linkedHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {
	
	//设计一个商品类，有商品名称，进价，产地，售价属性
	//重写equals方法和hashCode法
	//将5个商品对象添加到一个LinkedHashSet集合中
	//实现排重功能，使用迭代器遍历
	
	public static void main(String[] args) {
		HashSet<Good> s = new HashSet<>();		
		LinkedHashSet<Good> set = new LinkedHashSet<>();
		Good g1 = new Good("方便面", 1, "台湾", 2);
		Good g2 = new Good("泡面", 2, "台湾", 5);
		Good g3 = new Good("拉面", 1, "台湾", 2);
		Good g4 = new Good("麻酱面", 3, "台湾", 10);
		Good g5 = new Good("方便面", 1, "台湾", 2);
		//向集合s中添加元素
		s.add(g1);
		s.add(g2);
		s.add(g3);
		s.add(g4);
		s.add(g5);
		//向集合中添加这5个商品对象
		set.add(g1);
		set.add(g2);
		set.add(g3);
		set.add(g4);
		set.add(g5);
		System.out.println(set.size());
		//使用迭代器遍历set集合
		Iterator<Good> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		//遍历s集合
		Iterator<Good> it1 = s.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
	}

}
