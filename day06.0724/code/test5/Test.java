package test5;

public class Test {
	//4.���һ��Բ���࣬�е���Բ�κ͸����ԣ�
	//���м���Բ�����������ܺͼ���Բ�����������
	//Բ���ʣ�Math.PI

}
class Column {
	//�����
	public double fun() {
		return c.area() * h;
	}
	//������
	public double area() {
		double areaC = c.area();
		double areaH = c.sum() * h;
		return areaC + areaH;
	}
	Circle c;
	int h;
	//���췽��
	public Column() {}
	public Column(int i,int r) {
		h = i;
		c = new Circle(r);
	}
}
class Circle {
	int r;
	public Circle() {}
	public Circle(int i) {
		r = i;
	}
	//�����
	public double area() {
		return Math.PI * r * r;
	}
	//���ܳ�
	public double sum() {
		return Math.PI * 2 * r;
	}
}
