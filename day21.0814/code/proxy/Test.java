package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
	
	public static void main(String[] args) {
		//被代理对象引用
		RentHouse r = null;
		//代理对象引用
		InvocationHandler i = null;
		
		i = new ZhongJ();
		//达成代理协议，最后将返回值赋值给被代理引用
		//第一个参数是被代理对象实现的接口的加载器
		//第二个参数是被代理对象实现的接口的集合
		//第三个参数是一个代理对象的引用
		r = (RentHouse) Proxy.newProxyInstance(
				RentHouse.class.getClassLoader(), 
				new Class[]{RentHouse.class}, i);
		
		//最后还需要使用被代理对象调用功能方法
		r.rent();
		
	}

}
