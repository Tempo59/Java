package day14homework;

import java.util.ArrayList;

public interface Operation2 {
	
	//�����ϵ��
		public abstract ArrayList<Friend2> addFriend(Friend2 friend,ArrayList<Friend2> list);
		//������ɾ����ϵ��
		public abstract ArrayList<Friend2> deleteFriendByName(String name,ArrayList<Friend2> list);
		//����ϵ����ɾ����ϵ��
		public abstract ArrayList<Friend2> deleteFriendByNumber(String number,ArrayList<Friend2> list);
		//�������޸���ϵ�˺���
		public abstract ArrayList<Friend2> setFriend(String name,String number,ArrayList<Friend2> list);
		//��������ѯ��ϵ��
		public abstract ArrayList<Friend2> searchFriend(String name,ArrayList<Friend2> list);
		//��ѯ���е���ϵ��
		public abstract void searchAll(ArrayList<Friend2> list);

}
