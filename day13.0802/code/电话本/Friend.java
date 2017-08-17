package w02d10homework;

/**
 * 联系人类
 * @author Administrator
 *
 */
public class Friend {

	String name;
	int age;
	char sex;
	String number;

	@Override
	public String toString() {
		return "姓名是：" + name + ", 年龄是：" + age + ", 性别是：" + sex + ", 号码是：" + number;
	}

	public Friend() {
		super();
	}

	public Friend(String name, int age, char sex, String number) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.number = number;
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

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
