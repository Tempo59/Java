package treeMap;

import java.util.TreeMap;

public class Test1 {
	
	public static void main(String[] args) {
		
		//创建一个新的空treeMap集合
		TreeMap<String, Integer> map = new TreeMap<>();
		//添加元素
		map.put("hello", 1);
		map.put("world", 2);
		
		System.out.println(map.size());
		
	}

}



