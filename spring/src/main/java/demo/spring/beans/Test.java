package demo.spring.beans;

import us.codecraft.tinyioc.HelloSpring;

public class Test {
	
	public static void main(String[] args) throws Exception {
		BeanFactory bean = new BeanFactory();
		BeanDefinition beandefintion = new BeanDefinition();
		beandefintion.setBeanName("us.codecraft.tinyioc.HelloSpring");
		PropertyValue pro = new PropertyValue("name","zzy");
		PropertyValues list = new PropertyValues();
		list.setPropertyValue(pro);
		beandefintion.setPropertyValues(list);
		bean.registerBeanDefinition("hello", beandefintion);
		HelloSpring hello = (HelloSpring)bean.getBean("hello");
		
		hello.println();
		
		
	}
}
