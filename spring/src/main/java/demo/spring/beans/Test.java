package demo.spring.beans;

import us.codecraft.tinyioc.HelloSpring;

public class Test {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		BeanFactory bean = new BeanFactory();
		BeanDefinition beandefintion = new BeanDefinition();
		beandefintion.setBeanName("us.codecraft.tinyioc.HelloSpring");
		bean.registerBeanDefinition("hello", beandefintion);
		HelloSpring hello = (HelloSpring)bean.getBean("hello");
		hello.println();
	}
}
