package day13homework;

public class Util {

	public void fun1(double i,double j) {
		if(i!=0&&j!=0) {
			System.out.println(i*j);
		}else if(i==0||j==0) {
			throw new MyRuntimeException("���Ϊ0");
		}else {
			System.out.println("��֪������ʲô");
		}
	}
	
	public void fun2(String s1,String s2) throws Exception{
		if(s1.charAt(0)!=0&&s2.charAt(0)!=0) {
			if(s1.substring(1, s1.length()-1).matches("[0-9]")&&s2.substring(1, s2.length()-1).matches("[0-9]")) {
				int a=Integer.parseInt(s1)+Integer.parseInt(s2);
				System.out.println(a);
			}else {
				throw new MyException("�ַ������ܱ�ʾ����");
			}
		}else {
			throw new MyException("�ַ������ܱ�ʾ����");
		}
	}
	
	public void fun3(Object obj1,Object obj2) throws Exception{
		if((obj1 instanceof Integer||obj1 instanceof Byte||obj1 instanceof Short||obj1 instanceof Long
				||obj1 instanceof Boolean||obj1 instanceof Character||obj1 instanceof Float
				||obj1 instanceof Double||obj1 instanceof String)&&(obj2 instanceof Integer||obj2 instanceof Byte||obj2 instanceof Short||obj2 instanceof Long
						||obj2 instanceof Boolean||obj2 instanceof Character||obj2 instanceof Float
						||obj2 instanceof Double||obj2 instanceof String)) {
			System.out.println(obj1.toString()+obj2.toString());
		}else {
		    throw new MyException("�������������ν�");
		}
	}
}
