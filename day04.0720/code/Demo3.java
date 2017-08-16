class Demo3 
{
	public static void main(String[] args) 
	{
		//引用数据类型
		int[] a = {1,2,3};
		int[] b = a;
		b[1] = 7;
		System.out.println(a[1]);
		System.out.println();
	}
}
