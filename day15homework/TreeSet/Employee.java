package TreeSet;

public class Employee implements Comparable<Employee>{

	public int age;
	public int workyear;
	public double salary;
	public Employee(int age, int workyear, double salary) {
		super();
		this.age = age;
		this.workyear = workyear;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWorkyear() {
		return workyear;
	}
	public void setWorkyear(int workyear) {
		this.workyear = workyear;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(!(this.age==0&&this.workyear==0&&this.salary==0L)&&!(this.age==o.age)) {
			return this.age-o.age;
		}else if(!(this.workyear==o.workyear)) {
			return o.workyear-this.workyear;
		}else {
			return (int)(o.salary-this.salary);
		}
		
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", workyear=" + workyear + ", salary=" + salary + "]";
	}
	
	
}
