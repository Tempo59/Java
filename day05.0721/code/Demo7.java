class Demo7 
{
	public static void main(String[] args) 
	{
		int i =fun(5);
		System.out.println(i);
	}

	//ʹ�õݹ���õķ�������һ�����Ľ׳�
	public static int fun(int n){
		if(n==1){
			return 1;
		}else{

			return n * fun(n-1);
		}
	}
}
