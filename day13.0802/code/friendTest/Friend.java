package friendTest;

public class Friend {
	
	private String name;
	private int age;
	private char sex;
	private String id;
	@Override
	public String toString() {
		return "Friend [name=" + name + ", age=" + age + ", sex=" + sex + ", id=" + id + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Friend() {
		super();
	}
	public Friend(String name, int age, char sex, String id) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.id = id;
	}

}
