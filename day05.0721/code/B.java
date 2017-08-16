import java.util.*;
class B 
{
	public static void main(String[] args) 
	{ 
			Scanner input=new Scanner(System.in 

);
				int a=input.nextInt();	
				int b=input.nextInt();	
				int sum=0;
				int c=a;
				int d=0;
				for(int i=1;i<=b;i++){
				c=10*d+a;//得到下一个数
				sum=c+sum;
				d=d*10+a;
				}
				System.out.println(sum);

	}

}
