package maphomework;

import java.util.*;
import java.util.Map.Entry;

public class Test {
	
	public static void main(String[] args) {
		Person p1=new Person("ÕÔ",12,'ÄĞ',95.0);
		Person p2=new Person("Ç®",14,'ÄĞ',105.0);
		Person p3=new Person("Ëï",10,'Å®',125.5);
		Person p4=new Person("Àî",16,'Å®',90.5);
		Person p5=new Person("ÖÜ",18,'ÄĞ',96.0);
		Person p6=new Person("ÖÜ",18,'ÄĞ',96.0);
		util.hashMap(p1);
		util.hashMap(p2);
		util.hashMap(p3);
		util.hashMap(p4);
		util.hashMap(p5);
		util.hashMap(p6);
		Set<Entry<Person,String>> set1=util.map1.entrySet();
		Iterator<Entry<Person,String>> it1=set1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next().toString());
		}
		Student s1=new Student("ÕÔ",12,'ÄĞ',1000,125.5,121.0,129,270);
		Student s2=new Student("ÕÔ",12,'ÄĞ',1000,145,121.0,129,270);
		Student s3=new Student("Ç®",12,'ÄĞ',1000,125.5,120.0,130,270);
		Student s4=new Student("Ëï",12,'ÄĞ',1000,130,135.0,130,270);
		Student s5=new Student("Àî",12,'ÄĞ',1000,135,120.0,130,280);
		Student s6=new Student("Àî",13,'ÄĞ',1000,134,121.0,130,280);
		util.treeMap(s1);
		util.treeMap(s2);
		util.treeMap(s3);
		util.treeMap(s4);
		util.treeMap(s5);
		util.treeMap(s6);
		Set<Entry<Student,Double>> set2=util.map2.entrySet();
		Iterator<Entry<Student,Double>> it2=set2.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next().toString());
		}
	}

}
