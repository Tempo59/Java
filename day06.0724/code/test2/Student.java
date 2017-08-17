package test2;

public class Student {
	
	//属性
	int id;
	String name;
	Birthday birth;
	
	//构造方法
	public Student() {}
	public Student(int i,String s,Birthday b) {
		id = i;
		name = s;
		birth = b;
	}
	public Student(int i,String s,int y,int m,int d) {
		id = i;
		name = s;
		birth = new Birthday(y, m, d);
	}
	
	//自我介绍
	public void fun() {
		//我的名字是xxx，编号是1234，生日是xxxx年xx月xx日
		System.out.println("我的名字是"+name+",编号是"
				+id+",生日是"+birth.year+"年"
				+birth.month+"月"+birth.date+"日");
	}

}












