package testSet;
import java.util.Set;

public interface Operation {
	//添加商品
	public abstract void addGood(Set<Good> set, Good good);
	//按编号删除商品
	public abstract void deleteById(Set<Good> set, int id);
	//按名称删除商品
	public abstract void deleteByName(Set<Good> set, String name);
	//按商品销量修改商品的零售价
	public abstract void setPriceBySales(Set<Good> set, int sales, double newPrice);
	//按商品进价修改商品的批发价
	public abstract void setPriceByCost(Set<Good> set, double cost, double newPriceAll);
	//查找大于等于指定零售价的所有商品
	public abstract Set<Good> queryByPriceOne(Set<Good> set, double priceOne);
	//查找小于指定批发价的所有商品
	public abstract Set<Good> queryByPriceAll(Set<Good> set, double priceAll);
	//查询所有商品/按销量降序、批发价降序、零售价降序、进价降序、名称升序、编号升序
	public abstract void allQuery(Set<Good> set);
}
