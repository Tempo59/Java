class Demo10 
{
	public static void main(String[] args) 
	{
		/*
		��ϰ1��int[] arr = {1,2,3,4,5,6,7,8,9,0};
		�������������ҳ�����7���±�
		*/
		/*
		��ϰ2��
			int[] arr = {1,7,3,7,4,7,4,7}
			�ҳ�һ����������������7�ĸ���
		*/
		int[] arr = {1,2,3,7,5,6,7,8,9,0};
		for (int i=0; i<arr.length; i++)
		{
			if(arr[i]==7){
				System.out.println(i);
				//break;
			}
		}

		int count = 0;
		for (int i:arr)
		{
			if(i==7){
				count++;
			}
		}
		System.out.println(count);
	}
}
