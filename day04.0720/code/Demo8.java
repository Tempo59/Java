class Demo8 
{
	public static void main(String[] args) 
	{
		/*
1.将数组中每一个元素打印出来，
	使用“，”将每个元素隔开

	2.将数组中的每个元素求和并打印
		*/
		double[] a = {1.2,2.3,3.4};
		//1.2,2.3,3.4,
		for (int i=0; i<a.length; i++)
		{
			if(i==a.length-1){
				System.out.print(a[i]+"\n");
			}else{
				System.out.print(a[i]+",");
			}
			
		}

		double sum = 0;
		for (double d:a)
		{
			sum += d;
		}
		System.out.println(sum);
	}
}
