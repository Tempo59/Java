class Demo5 
{

	static int a = 2;
	int b = 3;

	public void fun(){
		System.out.println(a);
		fun1();
		System.out.println(b);
	}

	public static void main(String[] args) 
	{
		//int a = 3;
		//String s = "123";
		//System.out.println(a);
		//fun1();
		//fun1("hello");
		new Demo5().fun();
	}

	//��������
	public static void fun1(){
		System.out.println("�޲�fun1");
		//System.out.println(b);
	}

	public static void fun1(int a){
		System.out.println("intһ��fun1");
	}

	static void fun1(String a){
		System.out.println("һ��String fun1");
	}

	public static int fun1(int a,int b){
		return 1;
	}

	public static double fun1(double b, int a){
		return 1;
	}
	public static double fun1(int a,double b){
		return 1;
	}
}
