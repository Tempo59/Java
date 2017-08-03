package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test4 {
	
	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<>();
		l.add("Tom");
		l.add("张三");
		l.add("李四");
		
		fun(l, "张三");
		
		//使用ListIterator迭代遍历集合
		ListIterator<String> lit = l.listIterator();
		while(lit.hasNext()) {
//			System.out.println(lit.next());
			lit.next();
		}
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
//		//使用l集合获取迭代器
//		Iterator<String> it = l.iterator();
//		//判断迭代器是否有下一个元素，若有执行循环体，否则不执行
//		while(it.hasNext()) {
//			//将下一个元素输出
//			System.out.println(it.next());
//		}
		
	}
	
	//设计一个方法，从某一个ArrayList集合中删除指定的元素
	public static void fun(ArrayList<String> l, String s) {
		Iterator<String> it = l.iterator();
		String strs = null;
		while(it.hasNext()) {
			String str = it.next();
			if(str.equals(s)) {
				strs = str;
			}
		}
		l.remove(strs);
	}

}





