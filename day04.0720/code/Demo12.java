class Demo12 
{
	public static void main(String[] args) 
	{
		int[] arr = {3,2,5,43,87,68,0};
		//���ѭ����ȷ��λ��
		for (int i=0; i<arr.length; i++)
		{
			//�ڲ�ѭ�����Ƚϴ���
			for (int j=i+1; j<arr.length; j++)
			{
				//arr[i]
				if (arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i:arr)
		{
			System.out.println(i);
		}
		System.out.println();
	}
}
