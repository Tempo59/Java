package test3;

public class Test {
	//2.����һ������MyPoint��
	//�к����������ԣ������ж�����һ����֮��ľ���Ĺ���
	//Math.sqrt();
	//������빫ʽ��
	//Math.sqrt((x1-x2)^2 + (y1-y2)^2)
	public static void main(String[] args) {
		//�������������mp1mp2
		MyPoint mp1 = new MyPoint(0, 2);
		MyPoint mp2 = new MyPoint();
		//����mp2��mp1����֮��ľ���
		double l = mp2.fun(new MyPoint(5, 0));
		System.out.println(l);
		
	}
}

class MyPoint {
	int x,y;
	//���췽��
	public MyPoint() {}
	public MyPoint(int a,int b) {
		x = a;
		y = b;
	}
	public double fun(MyPoint mp) {
		int x1 = x - mp.x;
		int y1 = y - mp.y;
		int sum = x1 * x1 + y1 * y1;
		double l = Math.sqrt(sum);
		return l;
	}
}






