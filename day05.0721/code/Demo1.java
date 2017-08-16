class Demo1 
{

	//没有返回值 有return语句
	public static void fun(){
		for(int i=1; i<=100; i++){
			if(i==5){
				return;
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) 
	{
		int i = 2;
		int j = 3;
		//调用方法
		int d = add(i,j);//add(2,3)
		System.out.println(d);
	}

	//设计一个方法，计算两个正数的和
	public static int add(int a,int b){
		int c = a + b;
		return c;
	}

	//无参数无返回值的方法
	public static void water(){
		System.out.println("接水");
	}

	//有返回值无参数
	public static String water1(){
		return "一杯水";
	}

	//有返回值有参数的方法
	public static String water2(String str){
		String s = "使用"+str+"接了一杯水";
		return s;
	}
}
