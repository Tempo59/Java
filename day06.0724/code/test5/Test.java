package test5;

public class Test {
	//4.设计一个圆柱类，有底面圆形和高属性，
	//具有计算圆柱体表面积功能和计算圆柱体体积功能
	//圆周率：Math.PI

}
class Column {
	//求体积
	public double fun() {
		return c.area() * h;
	}
	//求表面积
	public double area() {
		double areaC = c.area();
		double areaH = c.sum() * h;
		return areaC + areaH;
	}
	Circle c;
	int h;
	//构造方法
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
	//求面积
	public double area() {
		return Math.PI * r * r;
	}
	//求周长
	public double sum() {
		return Math.PI * 2 * r;
	}
}
