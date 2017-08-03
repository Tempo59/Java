package day14homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args) {
		Util3 u=new Util3();
		ArrayList<GoodManager3> lp=new ArrayList<>();
		GoodManager3 m1=new GoodManager3("小宝","123");
		GoodManager3 m2=new GoodManager3("大宝","456");
		GoodManager3 m3=new GoodManager3("宝器","789");
		lp.add(m1);
		lp.add(m2);
		lp.add(m3);
		System.out.println("商品管理系统");
		System.out.println("请选择:");
		System.out.println("1.注册");
		System.out.println("2.登陆");
		Scanner input=new Scanner(System.in);
		
		if(input.nextInt()==1) {
			
			u.Register(lp);
			u.verify(lp);
		}else {
			u.verify(lp);
		}
	}

}
