package hashMap;

import java.util.HashMap;

public class Test1 {
	
	public static void main(String[] args) {
		//创建一个空的hashMap集合
		HashMap<Integer, String> map = new HashMap<>();
		//添加元素put方法
		map.put(1, "杨贵妃");
		map.put(2, "王昭君");
		System.out.println(map.size());
		//使用get方法获取1所对应的value
		System.out.println(map.get(1));
	}

}
