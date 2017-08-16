class Demo14 
{
	public static void main(String[] args) 
	{
		int[][] arr = {{1},{2,3},{4,5,6}};
		for (int[] a:arr)
		{
			for(int i:a){
				System.out.print(i);
			}
			System.out.println();
		}

		char[][] a = {{'*'},{'*','*'},{'*','*','*'}};
		for (char[] c:a)
		{
			for (char ch:c)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
		System.out.println();
	}
}
