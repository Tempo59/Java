class Demo13 
{
	public static void main(String[] args) 
	{
		int[] arr = {2,76,3,45,9,2,0};
		//���ѭ������ʾ�Ƚϵ�����
		for (int i=1; i<arr.length; i++)
		{
			//�ڲ�ѭ������ʾÿһ�ֱȽϵĴ���
			for (int j=0; j<arr.length-i; j++)
			{
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
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
