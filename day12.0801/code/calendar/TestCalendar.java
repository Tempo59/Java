package calendar;
import java.util.Calendar;
public class TestCalendar {
	
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.YEAR));
		c.set(Calendar.MONTH, 13);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		
//		c.set(Calendar.MONTH, 1);
		//获取字段的最大值
//		System.out.println(c.getMaximum(Calendar.DATE));
//		System.out.println(c.getActualMaximum(Calendar.DATE));
		
//		System.out.println(c.getMaximum(Calendar.YEAR));
		
//		System.out.println(c);
		
//		Calendar c1 = Calendar.getInstance();
		
//		System.out.println(c.YEAR);
//		System.out.println(c.get(c.YEAR));
//		c.set(Calendar.YEAR, 2018);
//		System.out.println(c.get(Calendar.YEAR));
//		System.out.println(c.get(1));
//		System.out.println(c.get(Calendar.MONTH));
//		System.out.println(c1.YEAR);
		
	}

}
