import java.util.*;
class  UU
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int sum=0;
		for (int i=2;i<a ;i++ )
		{
            if (a%i==0)
            {
				sum=sum+i;
            }
		}
		if (sum+1==a)
		{
			System.out.println("该数是完数");
		}
		else{System.out.println(" 该数不是完数");}
	}
}
