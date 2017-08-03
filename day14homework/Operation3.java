package day14homework;

import java.util.List;
//商品管理接口
public interface Operation3 {

	    //添加商品
		public abstract void addGood(List<Good3> list, Good3 good);
		//按编号删除商品
		public abstract void deleteById(List<Good3> list, int id);
		//按名称删除商品
		public abstract void deleteByName(List<Good3> list, String name);
		//按商品销量修改商品的零售价
		public abstract void setPriceByName(List<Good3> list, int sales, double newPrice);
		//按商品进价修改商品的批发价
		public abstract void setPriceByCost(List<Good3> list, double cost, double newPriceAll);
		//按零售价查询商品
		public abstract List<Good3> queryByPriceOne(List<Good3> list, double priceOne);
		//按批发价查询商品
		public abstract List<Good3> queryByPriceAll(List<Good3> list, double priceAll);
		//查询所有商品
		public abstract void queryAll(List<Good3> list);
}
