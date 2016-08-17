package demo.spring.aop;

import java.lang.reflect.Proxy;

public class Test {
	
	
	public static void main(String[] args) {
		CGLibProxy c =  CGLibProxy.getInstance();
		HelloImpl hello = c.getProxy(HelloImpl.class);
		hello.print();
	}
}
