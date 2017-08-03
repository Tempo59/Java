package arrayList;

import java.util.ArrayList;

public class Test1 {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
//		System.out.println(list.size());
//		System.out.println(list.isEmpty());
		list.add("zhangsan");
		list.add("lisi");
		list.add(1, "wangwu");
//		System.out.println(list.size());
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
		
		//先创建一个空的ArrayList集合
		ArrayList<String> l = new ArrayList<>();
//		System.out.println(l.size());
		//将list集合添加到l集合中
		l.addAll(list);
//		System.out.println(l.size());
		
		list.clear();
		System.out.println(list.size());
		System.out.println(l.size());
		
	}

}
