class Demo11 
{
	public static void main(String[] args) 
	{
		//��̬��ʼ��һ������
		int[] arr = {1,2,3,4,5,6,8,9};
		//����������������ʾ���ҵ����Χ����С��Χ���м�λ��
		int min = 0, max = arr.length-1, mid = 0;
		//ʹ��whileѭ��
		while (true)
		{
			//���м�λ���±�
			mid = (max + min) / 2;
			//���ҵ�Ԫ��
			if (arr[max]==7)
			{
				System.out.println(max);
				break;
			}
			if (arr[min]==7)
			{
				System.out.println(min);
				break;
			}
			if (arr[mid]==7)
			{
				System.out.println(mid);
				break;
			}
			//û�鵽
			if (arr[mid]>7)
			{
				max = mid - 1;
			}
			if (arr[mid]<7)
			{
				min = mid + 1;
			}
			//��max<=minʱ��˵��û��Ҫ���ҵ�Ԫ��
			if (max<=min)
			{
				System.out.println("û��Ҫ���ҵ�Ԫ��");
				break;
			}
		}
		System.out.println();
	}
}
