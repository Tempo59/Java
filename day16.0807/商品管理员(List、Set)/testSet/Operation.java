package testSet;
import java.util.Set;

public interface Operation {
	//�����Ʒ
	public abstract void addGood(Set<Good> set, Good good);
	//�����ɾ����Ʒ
	public abstract void deleteById(Set<Good> set, int id);
	//������ɾ����Ʒ
	public abstract void deleteByName(Set<Good> set, String name);
	//����Ʒ�����޸���Ʒ�����ۼ�
	public abstract void setPriceBySales(Set<Good> set, int sales, double newPrice);
	//����Ʒ�����޸���Ʒ��������
	public abstract void setPriceByCost(Set<Good> set, double cost, double newPriceAll);
	//���Ҵ��ڵ���ָ�����ۼ۵�������Ʒ
	public abstract Set<Good> queryByPriceOne(Set<Good> set, double priceOne);
	//����С��ָ�������۵�������Ʒ
	public abstract Set<Good> queryByPriceAll(Set<Good> set, double priceAll);
	//��ѯ������Ʒ/���������������۽������ۼ۽��򡢽��۽����������򡢱������
	public abstract void allQuery(Set<Good> set);
}
