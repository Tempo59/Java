package hashSet;

import java.util.HashSet;

public class Test2 {
	
	public static void main(String[] args) {
		
		HashSet<Food> set = new HashSet<>();
		Food f = new Food("ը��", "�׶�");
		Food f1 = new Food("ը��", "�׶�");
		System.out.println(f.equals(f1));
		System.out.println(f1.hashCode());
		System.out.println(f.hashCode());
		set.add(f1);
		set.add(f);
		System.out.println(set.size());
		
	}

}
