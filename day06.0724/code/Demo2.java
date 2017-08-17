class Demo2 
{
	public static void main(String[] args) 
	{
		for (int i=1; i<=4; i++)
		{
			//内层循环：控制空格输出
			for (int j=1; j<=4-i; j++)
			{
				System.out.print(" ");
			}
			//控制*的输出
			for (int j=1; j<=2*i-1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
}
