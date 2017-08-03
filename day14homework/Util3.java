package day14homework;

import java.util.List;
import java.util.Scanner;

//工具类,实现逻辑功能
public class Util3 {
	//注册商品管理员
	//这两个只作为工具类，不要写些什么Scanner，逻辑上感觉没错，Scanner报错了
	public void Register(List<GoodManager3> list) {
		Scanner input=new Scanner(System.in); 
		System.out.println("请输入用户名:");
		String username=input.next();
		for(int i=0;i<list.size();){
			if(list.get(i).getUsername().equals(username)){
				System.out.println("用户名已存在!请重新输入:");
				username=input.next();
		         i=0;
			}else {
				i++;
			}
		}
		GoodManager3 p=new GoodManager3();
		p.setUsername(username);
		System.out.println("请输入密码:");
		p.setPassword(input.next());
		list.add(p);
		System.out.println("注册成功!请登陆");
		input.close();
	}
	//验证商品管理员
	public GoodManager3 verify(List<GoodManager3> list) {
		Scanner input=new Scanner(System.in);
		GoodManager3 gm=new GoodManager3();
		System.out.println("请输入用户名:");
		String username=input.next();
		for(int i=0;i<list.size();){
			if(list.get(i).getUsername().equals(username)){
				gm=list.get(i);
				break;
			}else {
				i++;
			}
			if(i==4) {
				System.out.println("不存在这个用户,重新输入:");
				 username=input.next();
				 i=0;
			}
		}
		System.out.println("请输入密码:");
		String password=input.next();
		int j=0;
		while(j<2) {
		if(gm.getPassword().equals(password)) {
			System.out.println("登陆成功,可以进行增删改查");
			j=2;
		}else {
			System.out.println("密码错误,请重新输入:");
			password=input.next();
		}
		}
		input.close();
		return gm;
	}
	

}
