class  Demo3
{
	public static void main(String[] args) 
	{
		//���һ�������������������α�����ֵ
		/*
			��������������int
			����Ҫ����ֵ
		*/
		int i = 2;
		int j = 3;
		//change(i,j);
		//System.out.println(i);
		int[] arr = {i,j};
		System.out.println(arr[0]);
		change1(arr);
		System.out.println(arr[0]);
	}
	//��������������ֵ
	public static void change1(int[] arr){
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
	}

	//�˷�����Ч
	public static void change(int a, int b){
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a);
	}

	public static int search(int[] arr,int b){
		int index = -1;
		for (int i = 0; i<arr.length; i++){
			index ++;
			if (arr[i] == b){
				System.out.println("�±��ǣ�" + i);
				return index;
			}
		}
		return -1;
	}

}
