package day14homework;

import java.util.List;
//��Ʒ����ӿ�
public interface Operation3 {

	    //�����Ʒ
		public abstract void addGood(List<Good3> list, Good3 good);
		//�����ɾ����Ʒ
		public abstract void deleteById(List<Good3> list, int id);
		//������ɾ����Ʒ
		public abstract void deleteByName(List<Good3> list, String name);
		//����Ʒ�����޸���Ʒ�����ۼ�
		public abstract void setPriceByName(List<Good3> list, int sales, double newPrice);
		//����Ʒ�����޸���Ʒ��������
		public abstract void setPriceByCost(List<Good3> list, double cost, double newPriceAll);
		//�����ۼ۲�ѯ��Ʒ
		public abstract List<Good3> queryByPriceOne(List<Good3> list, double priceOne);
		//�������۲�ѯ��Ʒ
		public abstract List<Good3> queryByPriceAll(List<Good3> list, double priceAll);
		//��ѯ������Ʒ
		public abstract void queryAll(List<Good3> list);
}
