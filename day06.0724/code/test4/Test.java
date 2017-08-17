package test4;


public class Test {
	//3.设计一个点类，有横纵坐标属性，
	//具有判断与另一个点之间的距离的功能
	
	//设计一个圆类，有半径和圆心（一个点）属性，
	//具有判断一个点与这个圆的位置的功能,
	//和判断另一个圆与这个圆是否重合的功能
	public static void main(String[] args) {
		
		//创建一个圆类对象
		Circle c1 = new Circle(4, 0, 0);
		//再穿件一个圆类对象
		Circle c2 = new Circle(5, new MyPoint(0, 0));
		//创建一个点
		MyPoint mp = new MyPoint(3, 0);
		//判断c1与c2是否重合
		boolean boo = c1.fun2(c2);
		System.out.println(boo);
		//判断点mp和c1的位置关系
		c1.fun1(mp);
		
	}
}

class Circle {
	//判断两个圆是否重合
	public boolean fun2(Circle c) {
		boolean result = false;
		if(mp.x==c.mp.x 
				&& mp.y==c.mp.y 
				&& r==c.r) {
			result = true;
		}
		return result;
	}
	//点与远的位置关系
	public void fun1(MyPoint m) {
		//计算圆心与点m的距离
		double l = mp.fun(m);
		if(l>r) {
			System.out.println("点在圆外");
		}else if(l==r){
			System.out.println("点在圆上");
		}else {
			System.out.println("点在圆内");
		}
	}
	//圆心
	MyPoint mp;
	//半径
	int r;
//	构造方法
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
	//构造方法
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