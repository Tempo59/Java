class Demo4 
{
	public static void main(String[] args) 
	{
		int sum = add(new int[]{1,2,3,4,5});
		int s = add1(1,2,3,4,5);
		System.out.println(s);
	}

	public static int search(int[] arr,int b){
		int index = -1;
		for (int i = 0; i<arr.length; i++){
			index ++;
			if (arr[i] == b){
				System.out.println("�±��ǣ�" + i);
				return index;
			}/*else if(i == arr.length-1){	
				System.out.println("������û����Ҫ���ҵ���");
				return -1;
			}*/else{
				return -1;
			}
		}

	}


	//���һ���������������������ݵĺͣ����������
	/*
		�����������������
		����ֵ�����
	*/
	public static int add(int[] a){
		int sum = 0;
		for (int i:a)
		{
			sum += i;
		}
		return sum;
	}

	public static int add1(int...a){
		int sum = 0;
		for (int i:a)
		{
			sum += i;
		}
		return sum;
	}
}
