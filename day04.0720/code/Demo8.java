class Demo8 
{
	public static void main(String[] args) 
	{
		/*
1.��������ÿһ��Ԫ�ش�ӡ������
	ʹ�á�������ÿ��Ԫ�ظ���

	2.�������е�ÿ��Ԫ����Ͳ���ӡ
		*/
		double[] a = {1.2,2.3,3.4};
		//1.2,2.3,3.4,
		for (int i=0; i<a.length; i++)
		{
			if(i==a.length-1){
				System.out.print(a[i]+"\n");
			}else{
				System.out.print(a[i]+",");
			}
			
		}

		double sum = 0;
		for (double d:a)
		{
			sum += d;
		}
		System.out.println(sum);
	}
}
