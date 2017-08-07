package maphomework;



public class Student implements Comparable<Student>{

	private String name;
	private int age;
	private char sex;
	private int testnumber;
	private double mathgrade;
	private double chinesegrade;
	private double englishgrade;
	private double comprehensivegrade;
	private double allgrade=mathgrade+chinesegrade+englishgrade+comprehensivegrade;
	public Student(String name, int age, char sex, int testnumber, double mathgrade, double chinesegrade,
			double englishgrade, double comprehensivegrade) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.testnumber = testnumber;
		this.mathgrade = mathgrade;
		this.chinesegrade = chinesegrade;
		this.englishgrade = englishgrade;
		this.comprehensivegrade = comprehensivegrade;
		this.allgrade=mathgrade+chinesegrade+englishgrade+comprehensivegrade;
	}
	public Student() {
		super();
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
	public int getTestnumber() {
		return testnumber;
	}
	public void setTestnumber(int testnumber) {
		this.testnumber = testnumber;
	}
	public double getMathgrade() {
		return mathgrade;
	}
	public void setMathgrade(double mathgrade) {
		this.mathgrade = mathgrade;
	}
	public double getChinesegrade() {
		return chinesegrade;
	}
	public void setChinesegrade(double chinesegrade) {
		this.chinesegrade = chinesegrade;
	}
	public double getEnglishgrade() {
		return englishgrade;
	}
	public void setEnglishgrade(double englishgrade) {
		this.englishgrade = englishgrade;
	}
	public double getComprehensivegrade() {
		return comprehensivegrade;
	}
	public void setComprehensivegrade(double comprehensivegrade) {
		this.comprehensivegrade = comprehensivegrade;
	}
	
	public double getAllgrade() {
		return allgrade;
	}
	public void setAllgrade(double allgrade) {
		this.allgrade = allgrade;
	}
	@Override
	public String toString() {
		return "Student [姓名=" + name + ", 年龄=" + age + ", 性别=" + sex + ", 考号=" + testnumber + ", 数学成绩="
				+ mathgrade + ", 语文成绩=" + chinesegrade + ", 英语成绩=" + englishgrade
				+ ", 理综成绩=" + comprehensivegrade + ", 总分=" + allgrade + "]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return age;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student) {
			Student s=(Student)obj;
			if(this.name.equals(s.getName())&&this.age==s.getAge()
					&&this.sex==s.getSex()&&this.testnumber==s.getTestnumber()) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.name.equals(o.getName())&&this.age==o.getAge()&&this.sex==o.getSex()&&this.testnumber==o.getTestnumber()) {
			return 0;
		}else if(this.allgrade!=o.allgrade) {
			if(o.allgrade-this.allgrade>0) {
				return 1;
			}else {
				return -1;
			}
		}else if(this.comprehensivegrade!=o.getComprehensivegrade()) {
			if(o.getComprehensivegrade()-this.comprehensivegrade>0) {
				return 1;
			}else {
				return -1;
			}
		}else if(this.mathgrade!=o.getMathgrade()) {
			if(o.getMathgrade()-this.mathgrade>0) {
				return 1;
			}else {
				return -1;
			}
		}else if(this.englishgrade!=o.getEnglishgrade()) {
			if(o.getEnglishgrade()-this.englishgrade>0) {
				return 1;
			}else {
				return -1;
			}
		}else {
			return o.getChinesegrade()-this.chinesegrade>0?1:-1;
		}
	}
	
}
