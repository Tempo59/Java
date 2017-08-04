package day14homework;

import java.util.ArrayList;
import java.util.List;

//商品管理员类,实现Operation3接口
public class GoodManager3 implements Operation3{
	//登录名,密码等成员属性
	public String username;
	public String password;
	//构造方法与get/set方法
	public GoodManager3() {
		super();
	}

	public GoodManager3(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
    @Override
	public String toString() {
		return "GoodManager3 [username=" + username + ", password=" + password + "]";
	}

	//重写Operation3接口的方法
	@Override
	public void addGood(List<Good3> list, Good3 good) {
		// TODO Auto-generated method stub
		list.add(good);
		
	}


	@Override
	public void deleteById(List<Good3> list, int id) {
		// TODO Auto-generated method stub
		int index=0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getId()==id) {
				index=i;
			}
		}
		list.remove(index);
	}

	@Override
	public void deleteByName(List<Good3> list, String name) {
		// TODO Auto-generated method stub
		int index=0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals(name)) {
				index=i;
			}
		}
		list.remove(index);
	}

	@Override
	public void setPriceByName(List<Good3> list, int sales, double newPrice) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getSales()==sales) {
				list.get(i).setPriceOne(newPrice);
			}
		}
	}

	@Override
	public void setPriceByCost(List<Good3> list, double cost, double newPriceAll) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getCost()==cost) {
				list.get(i).setPriceAll(newPriceAll);
			}
		}
	}

	@Override
	public List<Good3> queryByPriceOne(List<Good3> list, double priceOne) {
		// TODO Auto-generated method stub
		ArrayList<Good3> al=new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getPriceOne()==priceOne) {
				al.add(list.get(i));
			}
		}
		return al;
	}

	@Override
	public List<Good3> queryByPriceAll(List<Good3> list, double priceAll) {
		// TODO Auto-generated method stub
		ArrayList<Good3> al=new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getPriceAll()==priceAll) {
				al.add(list.get(i));
			}
		}
		return al;
	}

	@Override
	public void queryAll(List<Good3> list) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).toString());
		}
	}

}
