class  Demo2
{
	public static void main(String[] args) 
	{
		//int[] arr = {1,2,3,4,5,6,7,8,9};
		int index = search(new int[]{1,2,3,4,5,6,7,8,9},1);
		System.out.println(index);
	}

	//���һ��������
	//��һ�������������ҳ�ָ����
	//Ԫ�ص�һ�γ��ֵ�λ��
	/*
		����ֵ���±꣬����int
		�βΣ�����
			��������int[]
			ָ��Ԫ��int
	*/
	public static int search(int[] arr,int value){
		int index = -1;
		for (int i=0; i<arr.length; i++)
		{
			if(arr[i]==value){
				index = i;
				break;
			}
		}
		return index;
	}
}
