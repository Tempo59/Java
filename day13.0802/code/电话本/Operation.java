package w02d10homework;

/**
 * 
 * @author Administrator
 *
 */
public interface Operation {

	/**
	 * �����ϵ��
	 * 
	 * @param friend
	 * @param friends
	 * @return
	 */
	public abstract Friend[] addFriend(Friend friend, Friend[] friends);

	/**
	 * ������ɾ����ϵ��
	 * 
	 * @param name
	 * @param friends
	 * @return
	 */
	public abstract Friend[] deleteFriendByName(String name, Friend[] friends);

	/**
	 * ������ɾ����ϵ��
	 * 
	 * @param number
	 * @param friends
	 * @return
	 */
	public abstract Friend[] deleteFriendByNumber(String number, Friend[] friends);

	/**
	 * �������޸���ϵ�˺���
	 * 
	 * @param name
	 * @param number
	 * @param friends
	 * @return
	 */
	public abstract Friend[] setFriendByName(String name, String number, Friend[] friends);

	/**
	 * ��������ѯ��ϵ��
	 * 
	 * @param name
	 * @param friends
	 * @return
	 */
	public abstract Friend searchFriend(String name, Friend[] friends);

	/**
	 * ��ѯ���е���ϵ��
	 * 
	 * @param friends
	 */
	public abstract void searchAll(Friend[] friends);

}
