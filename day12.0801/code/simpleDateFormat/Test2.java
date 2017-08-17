package simpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
	
	public static void main(String[] args) throws ParseException {
		
		String format = "dd日 a hh:mm:ss";
		
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		
		//使用parse方法将字符串转成Date对象
		String str = "31日 下午 02:33:23";
		
		Date d = sdf.parse(str);
		System.out.println(d);
		
	}

}






