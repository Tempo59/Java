class Demo1 
{

	//û�з���ֵ ��return���
	public static void fun(){
		for(int i=1; i<=100; i++){
			if(i==5){
				return;
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) 
	{
		int i = 2;
		int j = 3;
		//���÷���
		int d = add(i,j);//add(2,3)
		System.out.println(d);
	}

	//���һ���������������������ĺ�
	public static int add(int a,int b){
		int c = a + b;
		return c;
	}

	//�޲����޷���ֵ�ķ���
	public static void water(){
		System.out.println("��ˮ");
	}

	//�з���ֵ�޲���
	public static String water1(){
		return "һ��ˮ";
	}

	//�з���ֵ�в����ķ���
	public static String water2(String str){
		String s = "ʹ��"+str+"����һ��ˮ";
		return s;
	}
}
