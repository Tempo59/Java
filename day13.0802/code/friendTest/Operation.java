package friendTest;

public interface Operation {
	
	//�����ϵ��
	public abstract Friend[] addFriend(Friend friend,Friend[] friends);
	//������ɾ����ϵ��
	public abstract Friend[] deleteFriendByName(String name,Friend[] friends);
	//����ϵ����ɾ����ϵ��
	public abstract Friend[] deleteFriendByNumber(String number,Friend[] friends);
	//�������޸���ϵ�˺���
	public abstract Friend[] setFriend(String name,String number,Friend[] friends);
	//��������ѯ��ϵ��
	public abstract Friend searchFriend(String name,Friend[] friends);
	//��ѯ���е���ϵ��
	public abstract void searchAll(Friend[] friends);
	
}
