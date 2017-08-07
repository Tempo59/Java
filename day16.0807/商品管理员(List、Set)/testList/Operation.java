package testList;
import java.util.List;

public interface Operation {
	//�����Ʒ
	public abstract void addGood(List<Good> list, Good good);
	//�����ɾ����Ʒ
	public abstract void deleteById(List<Good> list, int id);
	//������ɾ����Ʒ
	public abstract void deleteByName(List<Good> list, String name);
	//����Ʒ�����޸���Ʒ�����ۼ�
	public abstract void setPriceBySales(List<Good> list, int sales, double newPrice);
	//����Ʒ�����޸���Ʒ��������
	public abstract void setPriceByCost(List<Good> list, double cost, double newPriceAll);
	//�����ۼ۲�ѯ��Ʒ
	public abstract List<Good> queryByPriceOne(List<Good> list, double priceOne);
	//�������۲�ѯ��Ʒ
	public abstract List<Good> queryByPriceAll(List<Good> list, double priceAll);
	//��ѯ������Ʒ
	public abstract void queryAll(List<Good> list);
}
