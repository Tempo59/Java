class  HH
{
	public static void main(String[] args) 
	{   
		int a =100;
		int sum=0;
		//RR(a);
        for (int i=1;i<=10 ;i++ )
        {
			a=a/2;
			sum=sum+a;
        }
		System.out.println("第十次弹起的高度为"+a);
		System.out.println("第十次弹起的高度为"+sum);
		
	}
		
		
 /*    public static int  ff(int a)
	{
		int count=0;

		for (int i=1; i<=10;i++ )
		{
			a=a/2;
			if (a==0)
			{
				count=i;
				break;
			}
		}
		return count;
		}

 public static void  RR(int a)
	{int sum=0;
		for (int i=1;i<=ff(a) ;i++ )
		{
            a=a/2;
			sum=a+sum;
		}
		System.out.println("第十次小球所经过的距离"+2*sum);
	}*/
}
