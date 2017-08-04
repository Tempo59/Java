package hashSet;

import java.util.HashSet;

public class Test1 {
	
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		//Ìí¼ÓÔªËØ
		String str = new String("Ñî¹óåú");
		set.add("Ñî¹óåú");
		set.add("Ñî¹óåú");
		set.add("ÍõÕÑ¾ı");
		set.add("ÍõÕÑ¾ı");
		set.add(str);
		System.out.println(str.equals("Ñî¹óåú"));
		System.out.println(set.size());
		
	}

}
