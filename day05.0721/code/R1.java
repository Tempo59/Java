import java.util.*;
class R1
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int sum=0;
		for (int i=1;i<=n;i++ )
		{
			int b=ff(i); 
			sum=sum+b;	
		}
		System.out.println(sum);
		
	}
	public static int  ff(int n)
	{   int s=0;
		if (n==1)
		{	
			 s=1;
			return s;
		}
		else
			{
			 s=n*ff(n-1);
			 return s;
		     }
     
	}
}
