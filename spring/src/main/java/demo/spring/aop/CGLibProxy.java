package demo.spring.aop;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CGLibProxy implements MethodInterceptor{

	private static CGLibProxy newStance= new CGLibProxy();

	private CGLibProxy(){}
	
	public static CGLibProxy getInstance(){
		return newStance;
	}
	
  public <T> T getProxy(Class<T> cls) {
        return (T) Enhancer.create(cls, this);
    }
	
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		before();
        Object result = arg3.invokeSuper(arg0, arg2);
        after();
        return result;
	}
	
	
	public void before(){
		System.out.println("before");
	}
	
	public void after(){
		System.out.println("after");
	}
}
