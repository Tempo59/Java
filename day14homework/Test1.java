package day14homework;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {

	public static void main(String[] args) {
		String i="1";
		String j="10";
		ArrayList<User1> list=new ArrayList<>();
		for(int k=0;k<10;k++) {
			list.add(new User1(i,j));
			i=(Integer.parseInt(i)+1)+"";
			j=(Integer.parseInt(j)-1)+"";
		}
		//��ͨ����
		for(int l=0;l<10;l++) {
			System.out.println(list.get(l).toString());
		}
		//�õ�����Iteratorʵ�ֱ���
		Iterator<User1> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
}
