package simpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
	
	public static void main(String[] args) {
		
		//��ָ����ʽ���һ������
		//xxxx��xx��xx��
		
		//ƴ�ַ�����ʾ��������ĸ�ʽ
		//2017��08��01�� ���� 09:55:22
		String format = "yyyy��MM��dd�� a hh:mm:ss";
		//����SimpleDateFormat����
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		//��date����ת�����ַ�����ʽ
		Date d = new Date();
		
		//ʹ��format������d�����ʽ����ָ����ʽ
		String dateStr = sdf.format(d);
		System.out.println(dateStr);
		System.out.println(d);
		
		
		String str = "E MMM dd HH:mm:ss z yyyy";
		SimpleDateFormat sdf1 = new SimpleDateFormat(str);
		String strDate = sdf1.format(d);
		System.out.println(strDate);
		
	}

}




