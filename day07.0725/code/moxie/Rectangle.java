package moxie;

public class Rectangle {
	
	int l;
	int w;
	
	//���췽��
	public Rectangle() {}
	public Rectangle(int i1,int i2) {
		l = i1;
		w = i2;
	}
	
	//�ܳ�
	public int sum() {
		return l * 2 + w * 2;
	}
	
	//���
	public int area() {
		return l * w;
	}

}






