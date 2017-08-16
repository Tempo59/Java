class Demo18 
{
	public static void main(String[] args) 
	{
		int a = 2;
		int b = 3;
		System.out.println(a&b);
		/*
			2		0000 0010
			3		0000 0011
					----------
					0000 0010	2
		*/

		System.out.println(a|b);
		/*
			2		0000 0010
			3		0000 0011
					----------
					0000 0011	3
		*/
	}
}
