package test2;

public class Student {
	
	//����
	int id;
	String name;
	Birthday birth;
	
	//���췽��
	public Student() {}
	public Student(int i,String s,Birthday b) {
		id = i;
		name = s;
		birth = b;
	}
	public Student(int i,String s,int y,int m,int d) {
		id = i;
		name = s;
		birth = new Birthday(y, m, d);
	}
	
	//���ҽ���
	public void fun() {
		//�ҵ�������xxx�������1234��������xxxx��xx��xx��
		System.out.println("�ҵ�������"+name+",�����"
				+id+",������"+birth.year+"��"
				+birth.month+"��"+birth.date+"��");
	}

}












