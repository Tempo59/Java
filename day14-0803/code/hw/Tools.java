package hw;

public class Tools {
	
	public static void main(String[] args) throws ZDYCheckException {
		
//		fun1(1,0);
//		fun2("asd","123");
		System.out.println(link(1,""));
		
	}
	//1）计算两个数的乘积，当这两个数都不为0时正常计算，
	//若有一个数为0那么在方法中声明一个运行时异常（提示：结果为0）
	public static void fun1(int a,int b) {
		if(a==0||b==0) {
			throw new ZDYRuntimeException("结果为0");
		}else {
			System.out.println(a+"*"+b+"="+a*b);
		}
	}
	
	//2）计算两个字符串所表示的整数的和，
	//先判断字符串是否表示整数，若表示整数计算机过并输出，
	//若字符串不表示整数在方法中声明一个非运行是异常
	//（提示：字符串不能表示整数）
	public static void fun2(String a,String b) {
		if(a.matches("\\d+")&&b.matches("\\d+")) {
			System.out.println(Integer.parseInt(a)+Integer.parseInt(b));
		}else {
			try {
				throw new ZDYCheckException("字符串不能表示正数");
			} catch (ZDYCheckException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//3）将两个Object对象连接在一起返回字符串，
	//若这两个对象是包装类对象或字符串则将这两个对象连接，
	//否则在方法中声明一个非运行是异常（提示：这两个对象不能链接）
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
			throw new ZDYCheckException("这两个对象不能连接");
		}
	}

}





