package demo.spring.beans;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanFactory {
	public BeanFactory(){}
	
	Map<String,BeanDefinition> map = new ConcurrentHashMap<String, BeanDefinition>();
	
	
	public void registerBeanDefinition(String name,BeanDefinition bean){
		map.put(name,bean);
	}
	
	public Object getBean(String name) throws InstantiationException, IllegalAccessException{
		BeanDefinition bean = map.get(name);
		bean.setBean(bean.getBeanClass().newInstance());
		return bean.getBean();
	}
}
