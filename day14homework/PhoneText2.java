package day14homework;

import java.util.ArrayList;


public class PhoneText2 implements Operation2{
   
	@Override//�����ϵ��
	public ArrayList<Friend2> addFriend(Friend2 friend, ArrayList<Friend2> list) {
		// TODO Auto-generated method stub
		list.add(friend);
		return list;
	}

	@Override//������ɾ����ϵ��
	public ArrayList<Friend2> deleteFriendByName(String name, ArrayList<Friend2> list) {
		// TODO Auto-generated method stub
	    for(int i=0;i<list.size();i++) {
	    	if(list.get(i).getName()==name) {
	    		list.remove(i);
	    	}
	    }
		return list;
	}

	@Override//���绰����ɾ����ϵ��
	public ArrayList<Friend2> deleteFriendByNumber(String number, ArrayList<Friend2> list) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++) {
	    	if(list.get(i).getNumber()==number) {
	    		list.remove(i);
	    	}
	    }
		return list;
	}

	@Override//�������޸ĵ绰����
	public ArrayList<Friend2> setFriend(String name, String number, ArrayList<Friend2> list) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++) {
	    	if(list.get(i).getName()==name) {
	    		list.get(i).setNumber(number);
	    	}
	    }
		return list;
	}

	@Override//��������ѯ��ϵ��
	public ArrayList<Friend2> searchFriend(String name, ArrayList<Friend2> list) {
		// TODO Auto-generated method stub
		ArrayList<Friend2> al=new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName()==name) {
				al.add(list.get(i));
			}
		}
		return al;
	}

	@Override//��ѯ������ϵ��
	public void searchAll(ArrayList<Friend2> list) {
		// TODO Auto-generated method stub
		for(Friend2 f:list) {
			System.out.println(f.toString());
		}
	}

		
}
