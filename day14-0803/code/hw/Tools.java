package hw;

public class Tools {
	
	public static void main(String[] args) throws ZDYCheckException {
		
//		fun1(1,0);
//		fun2("asd","123");
		System.out.println(link(1,""));
		
	}
	//1�������������ĳ˻�����������������Ϊ0ʱ�������㣬
	//����һ����Ϊ0��ô�ڷ���������һ������ʱ�쳣����ʾ�����Ϊ0��
	public static void fun1(int a,int b) {
		if(a==0||b==0) {
			throw new ZDYRuntimeException("���Ϊ0");
		}else {
			System.out.println(a+"*"+b+"="+a*b);
		}
	}
	
	//2�����������ַ�������ʾ�������ĺͣ�
	//���ж��ַ����Ƿ��ʾ����������ʾ������������������
	//���ַ�������ʾ�����ڷ���������һ�����������쳣
	//����ʾ���ַ������ܱ�ʾ������
	public static void fun2(String a,String b) {
		if(a.matches("\\d+")&&b.matches("\\d+")) {
			System.out.println(Integer.parseInt(a)+Integer.parseInt(b));
		}else {
			try {
				throw new ZDYCheckException("�ַ������ܱ�ʾ����");
			} catch (ZDYCheckException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//3��������Object����������һ�𷵻��ַ�����
	//�������������ǰ�װ�������ַ������������������ӣ�
	//�����ڷ���������һ�����������쳣����ʾ�����������������ӣ�
	public static String link(Object o1,Object o2) throws ZDYCheckException {
		boolean b1 = o1 instanceof Integer;
		System.out.println(b1);
		boolean b2 = o1 instanceof Double;
		System.out.println(b2);
		boolean b3 = o2 instanceof Integer;
		System.out.println(b3);
		boolean b4 = o2 instanceof Double;
		System.out.println(b4);
		if((b1||b2)&&(b3||b4)) {
			return ""+o1+o2;
		}else {
			throw new ZDYCheckException("����������������");
		}
	}

}





