package demo.spring.beans;

import java.util.ArrayList;
import java.util.List;

import demo.spring.beans.PropertyValue;

public class PropertyValues {
	private final List<PropertyValue> list = new ArrayList<PropertyValue>();
	
	public void setPropertyValue(PropertyValue pv){
		list.add(pv);
	}
	
	public List<PropertyValue> getPropertyValues() {
		return this.list;
	}
	
}
