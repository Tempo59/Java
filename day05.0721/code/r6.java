import java.util.*;
class  R6
{
	
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
	    int a=input.nextInt();
		int sum=0;
		int j=1;
	    for (int i=1; i<=a;i++ )
	    {
		   sum=sum+i;
     	}
		System.out.println(sum);
        while (j<=a)
        {
			sum=sum+j;
			j++;
        }
		System.out.println(sum);
		int k=0;
		do
		{  sum=sum+k;
		   k++;
		}
		while (k<=a);
		System.out.println(sum);
	}
}
