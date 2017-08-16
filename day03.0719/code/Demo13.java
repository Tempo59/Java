class Demo13 
{
	public static void main(String[] args) 
	{
		//外层循环：控制行输出
		for (int i=1; i<=5; i++)
		{
			//内层循环：控制列的输出
			for (int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
}
