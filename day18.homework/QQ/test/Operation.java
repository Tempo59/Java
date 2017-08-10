package test;

import java.io.File;
import java.util.List;

public interface Operation {
	//添加好友
	public abstract void addFriend(File file,QQFriend qqFriend);
	//按姓名删除好友
	public abstract void deleteFriend(File file,String name);
//	//按id删除好友
//	public abstract void deleteFriend(File file,Integer id);
	//按姓名查找好友
	public abstract List<QQFriend> queryFriend(File file,String name);
//	//按id查找好友
//	public abstract List<QQFriend> queryFriend(File file,Integer id);
//	//按性别查找好友
//	public abstract List<QQFriend> queryFriend(File file,Character sex);
	//查找所有好友
	public abstract List<QQFriend> queryFriend(File file);
}
