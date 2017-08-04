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
		int jump=1;
		while(jump==1) {
		int choose=input.nextInt();
		switch(choose) {
		case 1:System.out.println("请输入注册用户名:");
		       while(choose==1) {
		       String username=input.next();
		       //System.out.println(u.Register(lp, username));
		       if(u.Register(lp, username)) {
		    	   System.out.println("用户名存在,请重新输入注册用户名:");
		    	   choose=1;
		       }else {
		    	   choose=2;
		    	   System.out.println("请输入注册密码:");
		    	   String password=input.next();
		    	   GoodManager3 m4=new GoodManager3();
		    	   m4.setUsername(username);
		    	   m4.setPassword(password);
		    	   lp.add(m4);
		    	   System.out.println("注册成功并登陆成功!登陆用户为:"+m4.getUsername());
		       }
		       }
		       jump=2;
			break;
		case 2:System.out.println("请输入用户名:");
		       while(choose==2) {
		       String username=input.next();
		       if(u.Register(lp, username)) {
		    	   System.out.println("请输入密码:");
		    	   while(choose==2) {
		    	   String password=input.next();
		    	   if(u.verify(lp, username, password)) {
		    		   System.out.println("登陆成功!登陆用户为:"+username);
		    		   choose=1;
		    	   }else {
		    		   System.out.println("密码错误!请重新输入密码:");
		    	   }
		    	   }
		       }else {
		    	   System.out.println("用户不存在!请重新输入用户名:");
		       }
		       }
		       jump=2;
			break;
		default:System.out.println("请重新输入(1/2):");
		}
		}
	    System.out.println("请选择增删改查操作:");
	    //需要方法调用，现在已经登陆进来了，new一个对象调用方法就好，把实现类的方法写好就行
	}

}
