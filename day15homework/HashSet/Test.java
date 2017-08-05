package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
    //HashSet需要重写equals()和hashCode()方法
	public static void main(String[] args) {
		HashSet<Student> hs=new HashSet<>();
		Student s1=new Student("哈哈","123");
		Student s2=new Student("哈哈","123");
		Student s3=new Student("嘻嘻","123");
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		System.out.println(hs.size());
		Iterator<Student> it=hs.iterator();
	    while(it.hasNext()){
	    	System.out.println(it.next().toString());
	    }
	}
}
