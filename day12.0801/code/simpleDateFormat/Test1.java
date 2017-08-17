package simpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
	
	public static void main(String[] args) {
		
		//按指定格式输出一个日期
		//xxxx年xx月xx日
		
		//拼字符串表示日期输出的格式
		//2017年08月01日 上午 09:55:22
		String format = "yyyy年MM月dd日 a hh:mm:ss";
		//创建SimpleDateFormat对象
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		//将date对象转换成字符串格式
		Date d = new Date();
		
		//使用format方法将d对象格式化成指定格式
		String dateStr = sdf.format(d);
		System.out.println(dateStr);
		System.out.println(d);
		
		
		String str = "E MMM dd HH:mm:ss z yyyy";
		SimpleDateFormat sdf1 = new SimpleDateFormat(str);
		String strDate = sdf1.format(d);
		System.out.println(strDate);
		
	}

}




