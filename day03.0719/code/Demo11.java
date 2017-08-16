class Demo11 
{
	public static void main(String[] args) 
	{
		/*
案例：兔子繁殖问题：理想情况下，
每对兔子都是一公一母，一直保持生育能力
		题目：有一对兔子刚出生，
		从出生后第3个月起每个月都生一对兔子，
		小兔子长到第三个月后每个月又生一对兔子，
		假如兔子都不死，
		①问第20个月多少对兔子
		②第几个月,兔子的对数大于10000


		斐波那契数列
	*/

		int m1 = 1,m2 = 1,m3 = 0;
		int month = 2;
		do
		{
			m3 = m1 + m2;
			m1 = m2;
			m2 = m3;
			month++;
		}
		while (m3<10000);
		System.out.println(month);


		/*int month = 2;
		while (m3<100000)
		{
			m3 = m1 + m2;
			m1 = m2;
			m2 = m3;
			month++;
		}
		System.out.println(month);*/

	/*	for (int i=3; i<=25; i++)
		{
			m3 = m1 + m2;
			m1 = m2;
			m2 = m3;
		}
		
		System.out.println(m3);*/
	}
}
