package day14homework;

import java.util.List;

//��Ʒ����Ա��,ʵ��Operation3�ӿ�
public class GoodManager3 implements Operation3{
	//��¼��,����ȳ�Ա����
	public String username;
	public String password;
	//���췽����get/set����
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

	//��дOperation3�ӿڵķ���
	@Override
	public void addGood(List<Good3> list, Good3 good) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteById(List<Good3> list, int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByName(List<Good3> list, String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPriceByName(List<Good3> list, int sales, double newPrice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPriceByCost(List<Good3> list, double cost, double newPriceAll) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Good3> queryByPriceOne(List<Good3> list, double priceOne) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Good3> queryByPriceAll(List<Good3> list, double priceAll) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void queryAll(List<Good3> list) {
		// TODO Auto-generated method stub
		
	}

}
