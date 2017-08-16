class Demo15 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=10; i++){
			int a = 1;
			while(true){
				if(a==5){
					break;
				}
				System.out.println(i+"---"+a);
				a++;
			}
		}
	}
}
