package friendTest;

public class Operate implements Operation {

	@Override
	public Friend[] addFriend(Friend friend, Friend[] friends) {
		//����һ�������飬������ԭ����ĳ��ȼ�1
		Friend[] fs = new Friend[friends.length+1];
//		��ԭ�����е�Ԫ��ȫ���Ž������飬Ŀ�Ĳ���ʧԭ����ϵ��
		for(int i=0; i<friends.length; i++) {
			fs[i] = friends[i];
		}
//		����ӵ���ϵ�˷Ž�������
		fs[fs.length-1] = friend;
//		����������Ϊ����ֵ
		return fs;
	}

	@Override
	public Friend[] deleteFriendByName(String name, Friend[] friends) {
		//�����ָ����������ϵ�˵ĸ���
		int count = 0;
		for(Friend f:friends) {
			if(f.getName().equals(name)) {
				count++;
			}
		}
		Friend[] fs = new Friend[friends.length-count];
		//j��ʾfs������±�
		int j = 0;
		for(Friend f:friends) {
			if(!f.getName().equals(name)) {
				fs[j] = f;
				j++;
			}
		}
		return fs;
	}

	@Override
	public Friend[] deleteFriendByNumber(String number, Friend[] friends) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Friend[] setFriend(String name, String number, Friend[] friends) {
		for(int i=0; i<friends.length; i++) {
			if(friends[i].getName().equals(name)) {
				friends[i].setId(number);
			}
		}
		return friends;
	}

	@Override
	public Friend searchFriend(String name, Friend[] friends) {
		Friend friend = null;
		for(Friend f:friends) {
			if(f.getName().equals(name)) {
				friend = f;
//				break;
			}
		}
		return friend;
	}

	@Override
	public void searchAll(Friend[] friends) {
		for(Friend f:friends) {
			System.out.println(f);
		}
	}

}
