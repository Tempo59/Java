class Demo9 
{
	public static void main(String[] args) 
	{
		//3.�ҳ������е�����Ԫ��
		//�ҳ����Ԫ�غ��±�
		int[] arr = {1,5,32,9,6,56,44,9};
		int max = arr[0];
		int index = 0;
		for (int i=1; i<arr.length; i++)
		{
			if(max<arr[i]){
				max = arr[i];
				index = i;
			}
		}
		System.out.println("���Ԫ����"+max+"�����Ԫ�ص��±���"+index);
	}
}
