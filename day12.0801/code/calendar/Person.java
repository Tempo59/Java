package calendar;

public class Person {
	
	public final static int NAME = 1;
	public final static int AGE = 2;
	public final static int SEX = 3;
	
	private String name;
	private Integer age;
	private Character sex;
	
	public void set(int field, Object obj) {
		if(field==1) {
			name = (String) obj;
		}else if(field==2) {
			age = (Integer) obj;
		}else {
			sex = (Character) obj;
		}
	}
	
	public Object get(int field) {
		if(field==1) {
			return name;
		}else if(field==2) {
			return age;
		}else {
			return sex;
		}
	}
	
	public Person() {
		super();
	}
	public Person(String name, Integer age, Character sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

}
