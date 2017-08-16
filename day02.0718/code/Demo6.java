class Demo6 
{
	public static void main(String[] args) 
	{
		//字符和数值的相互转换：自动转换
		char a = 'a';
		int b = a;
		System.out.println(b);

		//强制转换：
		int c = 65;
		char d = (char)c;
		System.out.println(d);

		double e = 'a';
		System.out.println(e);
	}
}
