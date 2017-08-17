package test2;

public class Student {
	
	private String name;
	private int age;
	private String id;
	private double score;
	
	public Student() {}
	public Student(double score) {
		this.score = score;
	}
	public Student(String name,
			int age,String id,double score) {
		this(name,age,id);
		this.score = score;
	}
	
	public Student(String name,int age,String id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

}
