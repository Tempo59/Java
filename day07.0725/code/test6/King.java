package test6;

public class King {
	
	private String name;

	//˽�й��췽��
	private King (String name){
		this.name = name;
	}
	//��̬����˽�ж�����Ϊ����
	private static King king;
	//���о�̬������ȡ�������
	public static King getKing(){
		if(king==null) {
			king = new King("��ʼ��");
		}
		return king;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
