package w02d10homework;

/**
 * �߼�������
 * @author Administrator
 *
 */
public class Function implements Operation {

	@Override
	public Friend[] addFriend(Friend friend, Friend[] friends) {
		int count = 0;
		// �жϴ���ϵ���Ƿ��Ѿ����
		for (Friend f : friends) {
			if (f != null && f.getName().equals(friend.getName())) {
				System.out.println("���ʧ�ܣ�����ϵ�Ѿ�������!");
				return friends;
			}
			count++;
		}
		// �����м�Ԫ�ؿ��ܴ���null,����Ҫ��ѯ�����һ��Ԫ��
		if (count == friends.length) {
			for (int i = 0; i < friends.length; i++) {
				if (friends[i] == null) {
					friends[i] = friend;
					System.out.println("����ӵ���ϵ���ǣ�"+friends[i]);
					System.out.println("�����ϵ�˳ɹ�");
					break;
				} else if (friends[friends.length - 1] != null) {
					System.out.println("�����ϵ��ʧ�ܣ��绰���Ѿ�������!");
				}
			}

		}

		return friends;
	}

	@Override
	public Friend[] deleteFriendByName(String name, Friend[] friends) {
		int count = 0;
		for (int i = 0; i < friends.length; i++) {
			// �ж����������
			if (friends[i] != null && friends[i].getName().equals(name)) {
				friends[i] = null;
				System.out.println(friends[i]);
				System.out.println("ɾ����ϵ�˳ɹ�");
				return friends;
			}
			count++;
		}
		// �����м�Ԫ�ؿ��ܴ���null,����Ҫ��ѯ�����һ��Ԫ��
		if (count == friends.length) {
			System.out.println("��Ҫ���ҵ���ϵ�˲�����");
			return null;
		}

		return friends;
	}

	@Override
	public Friend[] deleteFriendByNumber(String number, Friend[] friends) {
		int count = 0;
		for (int i = 0; i < friends.length; i++) {
			// �ж����������
			if (friends[i] != null && friends[i].getNumber().equals(number)) {
				friends[i] = null;
				System.out.println(friends[i]);
				System.out.println("ɾ����ϵ�˳ɹ�");
				return friends;
			}
			count++;
		}
		// �����м�Ԫ�ؿ��ܴ���null,����Ҫ��ѯ�����һ��Ԫ��
		if (count == friends.length) {
			System.out.println("��Ҫ���ҵ���ϵ�˲�����");
			return null;
		}

		return friends;
	}

	@Override
	public Friend[] setFriendByName(String name, String number, Friend[] friends) {
		int count = 0;
		for (int i = 0; i < friends.length; i++) {
			// �ж����������
			if (friends[i] != null && friends[i].getName().equals(name)) {
				friends[i].setNumber(number);
				System.out.println("�޸ĺ����ϵ����Ϣ�ң�"+friends[i]);
				System.out.println("�޸���ϵ�˺���ɹ�");
				return friends;
			}
			count++;
		}
		// �����м�Ԫ�ؿ��ܴ���null,����Ҫ��ѯ�����һ��Ԫ��
		if (count == friends.length) {
			System.out.println("��Ҫ���ҵ���ϵ�˲�����");
			return null;
		}

		return friends;
	}

	@Override
	public Friend searchFriend(String name, Friend[] friends) {
		// �洢��ϵ�˸���
		int count = 0;
		for (int i = 0; i < friends.length; i++) {
			// �ж����������
			if (friends[i] != null) {
				if (friends[i].getName().equals(name)) {
					System.out.println("��Ҫ���ҵ���ϵ���ǣ�" + friends[i]);
					return friends[i];
				}
			}
			count++;
		}
		// �����м�Ԫ�ؿ��ܴ���null,����Ҫ��ѯ�����һ��Ԫ��
		if (count == friends.length) {
			System.out.println("��Ҫ���ҵ���ϵ�˲�����");
			return null;
		}

		return null;
	}

	@Override
	public void searchAll(Friend[] friends) {
		for (Friend f : friends) {
			if (f != null) {
				System.out.println(f);
			}
		}
	}

}
