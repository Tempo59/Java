package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
	
	public static void main(String[] args) {
		//�������������
		RentHouse r = null;
		//�����������
		InvocationHandler i = null;
		
		i = new ZhongJ();
		//��ɴ���Э�飬��󽫷���ֵ��ֵ������������
		//��һ�������Ǳ��������ʵ�ֵĽӿڵļ�����
		//�ڶ��������Ǳ��������ʵ�ֵĽӿڵļ���
		//������������һ��������������
		r = (RentHouse) Proxy.newProxyInstance(
				RentHouse.class.getClassLoader(), 
				new Class[]{RentHouse.class}, i);
		
		//�����Ҫʹ�ñ����������ù��ܷ���
		r.rent();
		
	}

}
