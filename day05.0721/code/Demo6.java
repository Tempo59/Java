class Demo6 
{
	public static void main(String[] args) 
	{
		//fun("hello",1,2,3,4,4,5,6,7,8);
		fun("str");
		System.out.println();
	}

	public static void fun(int...a){
		for (int i:a)
		{
			System.out.println(i);
		}
	}

	public static void fun(String str,int...a){
		System.out.println(str);
		for (int i:a)
		{
			System.out.println(str+i);
		}
	}

	public static void fun(int a,String...s){
		for (String str:s)
		{
			System.out.println(a+str);
		}
	}
}
