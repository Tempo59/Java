class Demo15 
{
	public static void main(String[] args) 
	{
		char[][] arr = {{' ',' ','*',' ',' '},{' ','*','*','*',' '},{'*','*','*','*','*'}};
		for (char[] ch:arr)
		{
			for (char c:ch)
			{
				System.out.print(c);
			}
			System.out.println();
		}
		System.out.println();
	}
}
