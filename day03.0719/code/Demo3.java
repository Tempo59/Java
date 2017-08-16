import java.util.*;
class Demo3 
{
	public static void main(String[] args) 
	{
		/*
案例：添加好友请求，判断男女，
若男残忍拒绝；
若女欣然接受；
若性别不明直接忽视。
		*/
		Scanner input = new Scanner(System.in);
		System.out.println("有人添加好友\n我看看是男是女");
		char sex = input.next().charAt(0);
		int i = 1;
		if (sex=='男')
		{
			if (i==1)
			{
				System.out.println("接受");
			}else{
				System.out.println("残忍拒绝");
			}
		}else{
			if (sex=='女')
			{
				System.out.println("欣然接受");
			}else{
				System.out.println("性别未知，直接忽视");
			}
		}
		System.out.println();
	}
}
