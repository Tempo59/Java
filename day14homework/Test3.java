package day14homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args) {
		Util3 u=new Util3();
		ArrayList<GoodManager3> lp=new ArrayList<>();
		GoodManager3 m1=new GoodManager3("С��","123");
		GoodManager3 m2=new GoodManager3("��","456");
		GoodManager3 m3=new GoodManager3("����","789");
		lp.add(m1);
		lp.add(m2);
		lp.add(m3);
		System.out.println("��Ʒ����ϵͳ");
		System.out.println("��ѡ��:");
		System.out.println("1.ע��");
		System.out.println("2.��½");
		Scanner input=new Scanner(System.in);
		
		if(input.nextInt()==1) {
			
			u.Register(lp);
			u.verify(lp);
		}else {
			u.verify(lp);
		}
	}

}
