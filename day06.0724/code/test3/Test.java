package test3;

public class Test {
	//2.定义一个点类MyPoint，
	//有横纵坐标属性，具有判断与另一个点之间的距离的功能
	//Math.sqrt();
	//两点距离公式：
	//Math.sqrt((x1-x2)^2 + (y1-y2)^2)
	public static void main(String[] args) {
		//创建两个点对象mp1mp2
		MyPoint mp1 = new MyPoint(0, 2);
		MyPoint mp2 = new MyPoint();
		//计算mp2与mp1两点之间的距离
		double l = mp2.fun(new MyPoint(5, 0));
		System.out.println(l);
		
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






