class  D1
{
	public static void main(String[] args) 
	{   

		int index=chazao(new int[]{1,2,3,4,5,6,8,9},6);
		System.out.println(index);
	}
	public static int chazao(int[] a,int b)
	{    int index=-1;
		for (int i=0;i<a.length ; i++)
		{
           if (a[i]==b)
               {  
			   index=i;
			   break;
			   }
		}
		   return index;
	}
}


