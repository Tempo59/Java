package hw;

public class Albb {
	//名字，性别、身高、薪水
	private String name;
	private char sex;
	private double height;
	private double sal;
	
	private Albb(String name,char sex,double height,double sal) {
		this.name = name;
		this.sex = sex;
		this.height = height;
		this.sal = sal;
	}
	
	private static Albb boss = new Albb("马云", '男', 160, 1);
	
	public static Albb getBoss() {
		return boss;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	
	

}
