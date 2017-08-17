package moxie;

public class Column {
	
	int h;
	Rectangle rec;
	
	//���췽��
	public Column() {}
	public Column(int i1,int i2,int i3) {
		h = i1;
		rec = new Rectangle(i2, i3);
	}
	public Column(int i1,Rectangle r) {
		h = i1;
		rec = r;
	}
	
	//�����
	public int sum() {
		return rec.sum() * h + rec.area()*2;
	}
	
	//���
	public int v() {
		return rec.area() * h;
	}
 
}





