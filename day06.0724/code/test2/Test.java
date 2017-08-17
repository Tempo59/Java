package test2;

public class Test {
	
	//1.定义学生类，包括编号、姓名、生日属性
	//生日包括年、月、日属性
	//定义类，创建对象，学生自我介绍
	//格式：
	//我的名字是xxx，编号是1234，生日是xxxx年xx月xx日
	/*
	 * 分析：
	 * 	学生类Student
	 * 	生日类： Birthday
	 */
	public static void main(String[] args) {
		
		//创建一个Student类的对象
		Student stu = new Student(1234, "Tom", 2017, 1, 1);
		//让stu自我介绍
		stu.fun();
		
		System.out.println(stu.birth.year);
		
	}

}




