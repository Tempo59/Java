package test4;


public class Test {
	//3.���һ�����࣬�к����������ԣ�
	//�����ж�����һ����֮��ľ���Ĺ���
	
	//���һ��Բ�࣬�а뾶��Բ�ģ�һ���㣩���ԣ�
	//�����ж�һ���������Բ��λ�õĹ���,
	//���ж���һ��Բ�����Բ�Ƿ��غϵĹ���
	public static void main(String[] args) {
		
		//����һ��Բ�����
		Circle c1 = new Circle(4, 0, 0);
		//�ٴ���һ��Բ�����
		Circle c2 = new Circle(5, new MyPoint(0, 0));
		//����һ����
		MyPoint mp = new MyPoint(3, 0);
		//�ж�c1��c2�Ƿ��غ�
		boolean boo = c1.fun2(c2);
		System.out.println(boo);
		//�жϵ�mp��c1��λ�ù�ϵ
		c1.fun1(mp);
		
	}
}

class Circle {
	//�ж�����Բ�Ƿ��غ�
	public boolean fun2(Circle c) {
		boolean result = false;
		if(mp.x==c.mp.x 
				&& mp.y==c.mp.y 
				&& r==c.r) {
			result = true;
		}
		return result;
	}
	//����Զ��λ�ù�ϵ
	public void fun1(MyPoint m) {
		//����Բ�����m�ľ���
		double l = mp.fun(m);
		if(l>r) {
			System.out.println("����Բ��");
		}else if(l==r){
			System.out.println("����Բ��");
		}else {
			System.out.println("����Բ��");
		}
	}
	//Բ��
	MyPoint mp;
	//�뾶
	int r;
//	���췽��
	public Circle() {}
	public Circle(int i, MyPoint m) {
		r = i;
		mp = m;
	}
	public Circle(int i1,int i2,int i3) {
		r = i1;
		mp = new MyPoint(i2, i3);
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