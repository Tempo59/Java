package testEmp;

public abstract class Employee {
	
	protected String name;
	protected int id;
	protected double sal;
	protected int grade;
	//���ҽ���
	public void introduce() {
		if(this instanceof Technology) {
			System.out.println("����"+name
					+"���ҵı����"+id
					+"������һ������Ա���ҵĹ�����"
					+sal+"���ҵĹ��ʼ�����"+grade);
		}else if(this instanceof SalesMan) {
			System.out.println("����"+name
					+"���ҵı����"+id
					+"������һ������Ա���ҵĹ�����"
					+sal+"���ҵĹ��ʼ�����"+grade);
		}else if(this instanceof SalesManager) {
			System.out.println("����"+name
					+"���ҵı����"+id
					+"������һ�����۾����ҵĹ�����"
					+sal+"���ҵĹ��ʼ�����"+grade);
		}else {
			System.out.println("����"+name
					+"���ҵı����"+id
					+"������һ���ܾ����ҵĹ�����"
					+sal+"���ҵĹ��ʼ�����"+grade);
		}
	}
	
	public Employee() {
		super();
	}
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSal() {
		return sal;
	}
	public int getGrade() {
		if(this.sal<3000) {
			return 1;
		}else if(this.sal>=3000&&this.sal<5000) {
			return 2;
		}else if(this.sal>=5000&&this.sal<8000) {
			return 3;
		}else {
			return 4;
		}
	}

}
