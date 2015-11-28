package com.mrgradus.objects;

import java.util.List;

public abstract class ILevel {

	protected List<IObject> objects;
	
	public void update(float delta){
		
	}
	
	public List<IObject> getAllObjects(){
		return objects;
		
	}
	
	public List<IObject> getObjectsWithPropertys(List<Property> propertys){
		return null;
		
	}
	
	public List<IObject> getObjectsWithPropertys(Property property){
		return null;
		
	}
}
