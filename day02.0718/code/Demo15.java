class Demo15 
{
	public static void main(String[] args) 
	{
		int a = 4;
		int b = 8;
		//boolean boo = (a++)>(--b) || (--a)<(b++);
		/*
			b-1		b=7
			a>b		false
			a+1		a=5
			a-1		a=4
			a<b		true
			b+1		b=8
			||		true
		*/

		//System.out.println(boo);
		//System.out.println(a);
		//System.out.println(b);

		boolean boo = (a++)<(--b) || (--a)>(b++);
		/*
			b-1		b=7
			a<b		true
			a+1		a=5

			a-1		a=4
			a>b		false
			b+1		b=8

			||		true
		*/
		System.out.println(boo);
		System.out.println(a);
		System.out.println(b);
	}
}
