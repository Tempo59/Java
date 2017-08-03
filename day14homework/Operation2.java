package day14homework;

import java.util.ArrayList;

public interface Operation2 {
	
	//添加联系人
		public abstract ArrayList<Friend2> addFriend(Friend2 friend,ArrayList<Friend2> list);
		//按姓名删除联系人
		public abstract ArrayList<Friend2> deleteFriendByName(String name,ArrayList<Friend2> list);
		//按联系号码删除联系人
		public abstract ArrayList<Friend2> deleteFriendByNumber(String number,ArrayList<Friend2> list);
		//按姓名修改联系人号码
		public abstract ArrayList<Friend2> setFriend(String name,String number,ArrayList<Friend2> list);
		//按姓名查询联系人
		public abstract ArrayList<Friend2> searchFriend(String name,ArrayList<Friend2> list);
		//查询所有的联系人
		public abstract void searchAll(ArrayList<Friend2> list);

}
