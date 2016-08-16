package us.codecraft.tinyioc;


import us.codecraft.tinyioc.beans.BeanDefinition;
import us.codecraft.tinyioc.beans.PropertyValue;
import us.codecraft.tinyioc.beans.PropertyValues;
import us.codecraft.tinyioc.beans.factory.AutowireCapableBeanFactory;


public class Test {
	
	public static void main(String[] args) throws Exception {
		AutowireCapableBeanFactory beanfactory = new AutowireCapableBeanFactory();
		BeanDefinition beanDefinition = new BeanDefinition();
		beanDefinition.setBeanClassName("us.codecraft.tinyioc.HelloSpring");
		PropertyValues propertyValues = new PropertyValues();
		propertyValues.addPropertyValue(new PropertyValue("name","zzy"));
		beanDefinition.setPropertyValues(propertyValues);
		beanfactory.registerBeanDefinition("hello",beanDefinition);
		
		
		
		
		HelloSpring hello = (HelloSpring)beanfactory.getBean("hello");
		hello.println();
	}
	
	
}
