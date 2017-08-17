package friendTest;

public interface Operation {
	
	//添加联系人
	public abstract Friend[] addFriend(Friend friend,Friend[] friends);
	//按姓名删除联系人
	public abstract Friend[] deleteFriendByName(String name,Friend[] friends);
	//按联系号码删除联系人
	public abstract Friend[] deleteFriendByNumber(String number,Friend[] friends);
	//按姓名修改联系人号码
	public abstract Friend[] setFriend(String name,String number,Friend[] friends);
	//按姓名查询联系人
	public abstract Friend searchFriend(String name,Friend[] friends);
	//查询所有的联系人
	public abstract void searchAll(Friend[] friends);
	
}
