package moxie;

public class Rectangle {
	
	int l;
	int w;
	
	//构造方法
	public Rectangle() {}
	public Rectangle(int i1,int i2) {
		l = i1;
		w = i2;
	}
	
	//周长
	public int sum() {
		return l * 2 + w * 2;
	}
	
	//面积
	public int area() {
		return l * w;
	}

}






