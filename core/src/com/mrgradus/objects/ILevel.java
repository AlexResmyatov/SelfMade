package com.mrgradus.objects;

import java.util.List;

public interface ILevel {

	public void update(float delta);
	
	public List<IObject> getAllObjects();
	
	public List<IObject> getObjectsWithPropertys(List<Property> propertys);
	
	public List<IObject> getObjectsWithPropertys(Property property);
}
