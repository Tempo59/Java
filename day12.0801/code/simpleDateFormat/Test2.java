package simpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
	
	public static void main(String[] args) throws ParseException {
		
		String format = "dd�� a hh:mm:ss";
		
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		
		//ʹ��parse�������ַ���ת��Date����
		String str = "31�� ���� 02:33:23";
		
		Date d = sdf.parse(str);
		System.out.println(d);
		
	}

}






