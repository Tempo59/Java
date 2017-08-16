class Demo6 
{
	public static void main(String[] args) 
	{
		//动态初始化数组
		char[] arr = new char[3];
		for (char i:arr)
		{
			System.out.println(i+"-");
		}

		arr[0] = 2;
		arr[1] = 3;
		arr[2] = 5;

		for (char i:arr)
		{
			System.out.println(i+"-");
		}
		System.out.println();
	}
}
