import java.util.*;
class Demo3 
{
	public static void main(String[] args) 
	{
		/*
��������Ӻ��������ж���Ů��
���в��ܾ̾���
��Ů��Ȼ���ܣ�
���Ա���ֱ�Ӻ��ӡ�
		*/
		Scanner input = new Scanner(System.in);
		System.out.println("������Ӻ���\n�ҿ���������Ů");
		char sex = input.next().charAt(0);
		int i = 1;
		if (sex=='��')
		{
			if (i==1)
			{
				System.out.println("����");
			}else{
				System.out.println("���ܾ̾�");
			}
		}else{
			if (sex=='Ů')
			{
				System.out.println("��Ȼ����");
			}else{
				System.out.println("�Ա�δ֪��ֱ�Ӻ���");
			}
		}
		System.out.println();
	}
}
