class Demo14 
{
	public static void main(String[] args) 
	{
		boolean b1 = true;
		boolean b2 = true;
		boolean b3 = false;
		boolean b4 = false;

		boolean r = !b1;
		System.out.println(r);//false

		r = b1 && b3;
		System.out.println(r);

		r = b1 || b4;
		System.out.println(r);
	}
}
