package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ZhongJ implements InvocationHandler {
	
	Person p = new Person();

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("收房东中介费");
		p.rent();
		System.out.println("收租户中介费");
		return null;
	}

}
