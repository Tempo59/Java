package test6;

public class Boss {
	
	//私有构造方法
	private Boss(String name,int age) {
		this.name = name;
		this.age = age;
	}
	//私有静态本类对象作为属性
	private static Boss boss = new Boss("马云", 10);
	//共有静态方法获取本类对象
	public static Boss getBoss() {
		return boss;
	}
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
