package exception_;

import java.security.acl.AclNotFoundException;
import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
//		try {
//			fun();
//		}catch(RuntimeException e) {
//			System.out.println("������ʱ�쳣����");
//		}catch(Exception e){
//			System.out.println("���쳣����");
//		}
		fun();
		
	}
	
	public static void fun() {
		Scanner input = new Scanner(System.in);
		System.out.println("fun");
		try {
			boolean b = false;
			if(b) {
				throw new AclNotFoundException();
			}else {
				System.out.println(b);
			}
		}catch(AclNotFoundException e) {
			System.out.println("AclNotFoundException�쳣");
			return;
		}finally {
			System.out.println("funfun");
		}
	}

}
