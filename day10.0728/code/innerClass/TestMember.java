package innerClass;

import innerClass.MemberInnerClass.Inner;

public class TestMember {
	
	public static void main(String[] args) {
		
		//��Ҫ������Ա�ڲ������ʱ�������ȴ����ⲿ��Ķ���
		MemberInnerClass out = new MemberInnerClass();
//		out.fun();
		
//		String s = out.name;
		
		//������Ա�ڲ������
		Inner in = out.new Inner();
		in.fun();
		
	}

}
