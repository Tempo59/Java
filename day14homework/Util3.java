package day14homework;

import java.util.List;
import java.util.Scanner;

//������,ʵ���߼�����
public class Util3 {
	//ע����Ʒ����Ա
	//������ֻ��Ϊ�����࣬��ҪдЩʲôScanner���߼��ϸо�û��Scanner������
	public void Register(List<GoodManager3> list) {
		Scanner input=new Scanner(System.in); 
		System.out.println("�������û���:");
		String username=input.next();
		for(int i=0;i<list.size();){
			if(list.get(i).getUsername().equals(username)){
				System.out.println("�û����Ѵ���!����������:");
				username=input.next();
		         i=0;
			}else {
				i++;
			}
		}
		GoodManager3 p=new GoodManager3();
		p.setUsername(username);
		System.out.println("����������:");
		p.setPassword(input.next());
		list.add(p);
		System.out.println("ע��ɹ�!���½");
		input.close();
	}
	//��֤��Ʒ����Ա
	public GoodManager3 verify(List<GoodManager3> list) {
		Scanner input=new Scanner(System.in);
		GoodManager3 gm=new GoodManager3();
		System.out.println("�������û���:");
		String username=input.next();
		for(int i=0;i<list.size();){
			if(list.get(i).getUsername().equals(username)){
				gm=list.get(i);
				break;
			}else {
				i++;
			}
			if(i==4) {
				System.out.println("����������û�,��������:");
				 username=input.next();
				 i=0;
			}
		}
		System.out.println("����������:");
		String password=input.next();
		int j=0;
		while(j<2) {
		if(gm.getPassword().equals(password)) {
			System.out.println("��½�ɹ�,���Խ�����ɾ�Ĳ�");
			j=2;
		}else {
			System.out.println("�������,����������:");
			password=input.next();
		}
		}
		input.close();
		return gm;
	}
	

}
