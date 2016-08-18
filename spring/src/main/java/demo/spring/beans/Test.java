package demo.spring.beans;

public class Test {

	public static void main(String[] args) throws Exception {
		BeanFactory beanfactory = new AutowireCapableBeanFactory();
		BeanDefinintion bean = new BeanDefinintion();
		bean.setBeanClassName("demo.spring.beans.Hello");
		PropertyValue py = new PropertyValue("name","zhuzhenyu");
		PropertyValues ps = new PropertyValues();
		ps.addPropertyValue(py);
		bean.setPv(ps);
		beanfactory.registerBeanDefinition("hello", bean);
		Hello hello = (Hello)beanfactory.getBean("hello");
		hello.hello();

	
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
