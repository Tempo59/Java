package exception_;

import java.util.Scanner;

public class TestZDYException {
	
	public static void main(String[] args) throws ZDYException {
		
		//���һ����½����
		//ʹ��QQ�����½������������֮���жϸ�ʽ�Ƿ���ȷ
		//����ȷ��������
		//�����׳�ZDYException
		Scanner input = new Scanner(System.in);
		System.out.println("������QQ����");
		String email = input.next();
		String regex = "\\d{6,11}[@]{1}[q]{2}[.][c][o][m]";
		if(email.matches(regex)) {
			System.out.println("����������");
			String pwd = input.next();
		}else {
			throw new ZDYException("�����ʽ����");
		}
		
	}

}
