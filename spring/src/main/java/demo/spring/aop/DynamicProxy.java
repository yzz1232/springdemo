package demo.spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {

	private Object targer;
	
	public DynamicProxy(Object target){
		this.targer = target;
	}
	
	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		 before();
        Object result = arg1.invoke(arg0, arg2);
        after();
        return result;
	}
	
	 @SuppressWarnings("unchecked")
	    public <T> T getProxy() {
	        return (T) Proxy.newProxyInstance(
	        		targer.getClass().getClassLoader(),
	        		targer.getClass().getInterfaces(),
	            this
	        );
	    }
	
	public void before(){
		System.out.println("before");
	}
	
	public void after(){
		System.out.println("after");
	}
	
	
	
}
