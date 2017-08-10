package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QQ implements Operation {
	
	private String id;
	private String pwd;
	

	public QQ() {
		super();
	}

	public QQ(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public void addFriend(File file, QQFriend qqFriend) {
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		Tools.check(file);
		try {
			ois = new ObjectInputStream(new FileInputStream(file));
			ArrayList<QQFriend> list = (ArrayList<QQFriend>) ois.readObject();
			list.add(qqFriend);
//			System.out.println(list.size());
			oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(list);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Tools.close(ois,oos);
		}
	}

	@Override
	public void deleteFriend(File file, String name) {
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		Tools.check(file);
		ArrayList<QQFriend> l = new ArrayList<>();
		try {
			ois = new ObjectInputStream(new FileInputStream(file));
			ArrayList<QQFriend> list = (ArrayList<QQFriend>) ois.readObject();
			Iterator<QQFriend> it = list.iterator();
			while(it.hasNext()){
				QQFriend friend = it.next();
				if(friend.getName().equals(name)){
					l.add(friend);
				}
			}
			Iterator<QQFriend> it1 = l.iterator();
			while(it1.hasNext()){
				list.remove(it1.next());
			}
//			System.out.println(l.size());
			oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(list);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Tools.close(ois, oos);
		}
	}

	@Override
	public List<QQFriend> queryFriend(File file, String name) {
		ObjectInputStream ois = null;
		Tools.check(file);
		ArrayList<QQFriend> l = new ArrayList<>();
		ArrayList<QQFriend> list;
		try {
			ois = new ObjectInputStream(new FileInputStream(file));
			list = (ArrayList<QQFriend>) ois.readObject();
			Iterator<QQFriend> it = list.iterator();
			while(it.hasNext()){
				QQFriend qqFriend = it.next();
				if(qqFriend.getName().equals(name)){
					l.add(qqFriend);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Tools.close(ois, null);
		}
//		System.out.println(l.size());
		return l;
	}

	@Override
	public List<QQFriend> queryFriend(File file) {
		ObjectInputStream ois = null;
		Tools.check(file);
		ArrayList<QQFriend> list = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(file));
			list = (ArrayList<QQFriend>) ois.readObject();
			return list;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Tools.close(ois, null);
		}
//		System.out.println(list.size());
		return list;
		
	}

}
