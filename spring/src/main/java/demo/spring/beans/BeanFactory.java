package demo.spring.beans;


public interface BeanFactory {

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class BeanFactory {
	public BeanFactory(){}

	
	Object getBean(String name) throws Exception;
	

	void registerBeanDefinition(String name,BeanDefinintion bean);

	
	public void registerBeanDefinition(String name,BeanDefinition bean){
		map.put(name,bean);
	}
	
	public Object getBean(String name) throws Exception{
		BeanDefinition bean = map.get(name);
		bean.setBean(bean.getBeanClass().newInstance());
		applyPropertyValues(bean.getBean(),bean);
		return bean.getBean();
	}
	
	protected void applyPropertyValues(Object bean, BeanDefinition mbd) throws Exception {
		
		for(demo.spring.beans.PropertyValue propertyValue:mbd.getPropertyValues().getPropertyValues()){
			Field declareField = bean.getClass().getDeclaredField(propertyValue.getName());
			declareField.setAccessible(true);
			declareField.set(bean,propertyValue.getValue());
		}
	}
>>>>>>> branch 'master' of git@github.com:zhuzhenyu1994/springdemo.git
}

