class Demo12
{
	public static void main(String[] args) 
	{
		//外层循环控制行的输出
		for (int i=2; i<=6; i++)
		{
			//内层循环控制列的输出
			for (int j=1; j<=7; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//System.out.println();
	}
}
