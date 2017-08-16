class Demo9 
{
	public static void main(String[] args) 
	{
		//3.找出数组中的最大的元素
		//找出最大元素和下标
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
		System.out.println("最大元素是"+max+"，最大元素的下表是"+index);
	}
}
