package w02d10homework;

/**
 * 
 * @author Administrator
 *
 */
public interface Operation {

	/**
	 * 添加联系人
	 * 
	 * @param friend
	 * @param friends
	 * @return
	 */
	public abstract Friend[] addFriend(Friend friend, Friend[] friends);

	/**
	 * 按姓名删除联系人
	 * 
	 * @param name
	 * @param friends
	 * @return
	 */
	public abstract Friend[] deleteFriendByName(String name, Friend[] friends);

	/**
	 * 按号码删除联系人
	 * 
	 * @param number
	 * @param friends
	 * @return
	 */
	public abstract Friend[] deleteFriendByNumber(String number, Friend[] friends);

	/**
	 * 按姓名修改联系人号码
	 * 
	 * @param name
	 * @param number
	 * @param friends
	 * @return
	 */
	public abstract Friend[] setFriendByName(String name, String number, Friend[] friends);

	/**
	 * 按姓名查询联系人
	 * 
	 * @param name
	 * @param friends
	 * @return
	 */
	public abstract Friend searchFriend(String name, Friend[] friends);

	/**
	 * 查询所有的联系人
	 * 
	 * @param friends
	 */
	public abstract void searchAll(Friend[] friends);

}
