class  Demo2
{
	public static void main(String[] args) 
	{
		//int[] arr = {1,2,3,4,5,6,7,8,9};
		int index = search(new int[]{1,2,3,4,5,6,7,8,9},1);
		System.out.println(index);
	}

	//设计一个方法，
	//从一个整形数组中找出指定的
	//元素第一次出现的位置
	/*
		返回值：下标，整形int
		形参：两个
			整形数组int[]
			指定元素int
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
