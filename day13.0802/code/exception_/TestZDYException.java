package exception_;

import java.util.Scanner;

public class TestZDYException {
	
	public static void main(String[] args) throws ZDYException {
		
		//设计一个登陆过程
		//使用QQ邮箱登陆，输入完邮箱之后判断格式是否正确
		//若正确输入密码
		//否则抛出ZDYException
		Scanner input = new Scanner(System.in);
		System.out.println("请输入QQ邮箱");
		String email = input.next();
		String regex = "\\d{6,11}[@]{1}[q]{2}[.][c][o][m]";
		if(email.matches(regex)) {
			System.out.println("请输入密码");
			String pwd = input.next();
		}else {
			throw new ZDYException("邮箱格式错误");
		}
		
	}

}
