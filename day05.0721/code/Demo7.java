class Demo7 
{
	public static void main(String[] args) 
	{
		int i =fun(5);
		System.out.println(i);
	}

	//使用递归调用的方法，求一个数的阶乘
	public static int fun(int n){
		if(n==1){
			return 1;
		}else{

			return n * fun(n-1);
		}
	}
}
