package innerClass;

import innerClass.MemberInnerClass.Inner;

public class TestMember {
	
	public static void main(String[] args) {
		
		//想要创建成员内部类对象时，必须先创建外部类的对象
		MemberInnerClass out = new MemberInnerClass();
//		out.fun();
		
//		String s = out.name;
		
		//创建成员内部类对象
		Inner in = out.new Inner();
		in.fun();
		
	}

}
