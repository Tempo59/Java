package day14homework;

import java.util.List;


//工具类,实现逻辑功能
public class Util3 {
	//注册商品管理员
	//这两个只作为工具类，不要写些什么Scanner，逻辑上感觉没错，Scanner报错了
	public boolean Register(List<GoodManager3> list,String username) {
		boolean boo=false;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getUsername().equals(username)) {
				boo=true;
				break;
			}
		}
		return boo;
	}
	//验证商品管理员
	public boolean verify(List<GoodManager3> list,String username,String password) {
		boolean boo=false;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getUsername().equals(username)&&list.get(i).getPassword().equals(password)) {
				boo=true;
				break;
			}
		}
		return boo;
	}
	
}
