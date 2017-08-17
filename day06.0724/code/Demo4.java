class Demo4 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,63,7,8,9};
		int index1 = 0;
		int index2 = 1;
		int max1 = arr[0];
		int max2 = arr[1];
		if(max1<max2){
			int temp = max1;
			max1 = max2;
			max2 = temp;
			temp = index1;
			index1 = index2;
			index2 = temp;
		}
		for (int i=2; i<arr.length; i++)
		{
			if (max1<arr[i])
			{
				max2 = max1;
				max1 = arr[i];
				index2 = index1;
				index1 = i;
			}else if(max2<arr[i]){
				max2 = arr[i];
				index2 = i;
			}
		}
		System.out.println(max2+"   "+index2);
	}
}
