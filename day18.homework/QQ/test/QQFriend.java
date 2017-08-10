package test;

import java.io.Serializable;

public class QQFriend implements Serializable {
	
	//属性
	private String id;
	private String name;
	private Character sex;
	private Integer age;
	private String say;
	//构造方法
	public QQFriend() {
		super();
	}
	public QQFriend(String id, String name, Character sex, Integer age, String say) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.say = say;
	}
	//get、set
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Character getSex() {
		return sex;
	}
	public void setSex(Character sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSay() {
		return say;
	}
	public void setSay(String say) {
		this.say = say;
	}
	
	//toString
	@Override
	public String toString() {
		return "QQFriend [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", say=" + say + "]";
	}
	
	
}
