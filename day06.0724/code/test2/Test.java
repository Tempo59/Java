package test2;

public class Test {
	
	//1.����ѧ���࣬������š���������������
	//���հ����ꡢ�¡�������
	//�����࣬��������ѧ�����ҽ���
	//��ʽ��
	//�ҵ�������xxx�������1234��������xxxx��xx��xx��
	/*
	 * ������
	 * 	ѧ����Student
	 * 	�����ࣺ Birthday
	 */
	public static void main(String[] args) {
		
		//����һ��Student��Ķ���
		Student stu = new Student(1234, "Tom", 2017, 1, 1);
		//��stu���ҽ���
		stu.fun();
		
		System.out.println(stu.birth.year);
		
	}

}




