class Demo11 
{
	public static void main(String[] args) 
	{
		/*
���������ӷ�ֳ���⣺��������£�
ÿ�����Ӷ���һ��һĸ��һֱ������������
		��Ŀ����һ�����Ӹճ�����
		�ӳ������3������ÿ���¶���һ�����ӣ�
		С���ӳ����������º�ÿ��������һ�����ӣ�
		�������Ӷ�������
		���ʵ�20���¶��ٶ�����
		�ڵڼ�����,���ӵĶ�������10000


		쳲���������
	*/

		int m1 = 1,m2 = 1,m3 = 0;
		int month = 2;
		do
		{
			m3 = m1 + m2;
			m1 = m2;
			m2 = m3;
			month++;
		}
		while (m3<10000);
		System.out.println(month);


		/*int month = 2;
		while (m3<100000)
		{
			m3 = m1 + m2;
			m1 = m2;
			m2 = m3;
			month++;
		}
		System.out.println(month);*/

	/*	for (int i=3; i<=25; i++)
		{
			m3 = m1 + m2;
			m1 = m2;
			m2 = m3;
		}
		
		System.out.println(m3);*/
	}
}
