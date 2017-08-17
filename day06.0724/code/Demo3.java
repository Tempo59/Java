class Demo3 
{
	public static void main(String[] args) 
	{
		int l = 3000;
		int count = 0;
		while(l>=5){
			count++;
			l /= 2;
		}
		System.out.println(count);
	}
}
