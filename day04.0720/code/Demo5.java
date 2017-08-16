class Demo5 
{
	public static void main(String[] args) 
	{
		//使用普通循环遍历数组
		char[] arr = {97,98,99};
		for (int i=0; i<arr.length; i++)
		{
			//System.out.println(arr[i]);
		}

		//使用增强for循环遍历数组
		for (char c:arr)
		{
			System.out.print(c);
		}
		System.out.println();
	}
}
