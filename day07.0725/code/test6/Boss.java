package test6;

public class Boss {
	
	//˽�й��췽��
	private Boss(String name,int age) {
		this.name = name;
		this.age = age;
	}
	//˽�о�̬���������Ϊ����
	private static Boss boss = new Boss("����", 10);
	//���о�̬������ȡ�������
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
