package test;

import java.io.File;
import java.util.List;

public interface Operation {
	//��Ӻ���
	public abstract void addFriend(File file,QQFriend qqFriend);
	//������ɾ������
	public abstract void deleteFriend(File file,String name);
//	//��idɾ������
//	public abstract void deleteFriend(File file,Integer id);
	//���������Һ���
	public abstract List<QQFriend> queryFriend(File file,String name);
//	//��id���Һ���
//	public abstract List<QQFriend> queryFriend(File file,Integer id);
//	//���Ա���Һ���
//	public abstract List<QQFriend> queryFriend(File file,Character sex);
	//�������к���
	public abstract List<QQFriend> queryFriend(File file);
}
