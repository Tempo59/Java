class Demo11 
{
	public static void main(String[] args) 
	{
		//静态初始化一个数组
		int[] arr = {1,2,3,4,5,6,8,9};
		//定义三个变量：表示查找的最大范围，最小范围，中间位置
		int min = 0, max = arr.length-1, mid = 0;
		//使用while循环
		while (true)
		{
			//求中间位置下标
			mid = (max + min) / 2;
			//查找到元素
			if (arr[max]==7)
			{
				System.out.println(max);
				break;
			}
			if (arr[min]==7)
			{
				System.out.println(min);
				break;
			}
			if (arr[mid]==7)
			{
				System.out.println(mid);
				break;
			}
			//没查到
			if (arr[mid]>7)
			{
				max = mid - 1;
			}
			if (arr[mid]<7)
			{
				min = mid + 1;
			}
			//当max<=min时，说明没有要查找的元素
			if (max<=min)
			{
				System.out.println("没有要查找的元素");
				break;
			}
		}
		System.out.println();
	}
}
