package com.mrgradus.objects;

import java.util.ArrayList;
import java.util.List;

public abstract class ALevel {

	protected List<IObject> objects;
	
	public void update(float delta){
		
	}
	
	public List<IObject> getAllObjects(){
		return objects;
		
	}
	
	public List<IObject> getObjectsWithPropertys(List<String> propertys){
		List<IObject> objectsWithPropertys = new ArrayList<IObject>();
		for(IObject object: objects){
				if(object.getPropertys().containsAll(propertys)){
					objectsWithPropertys.add(object);
				}

		}
		return objectsWithPropertys;
		
	}
	
	public List<IObject> getObjectsWithPropertys(String property){
		return null;
		
	}
	
	public void dispose(){
		for(IObject object : objects){
			object.dispose();
		}
	}
}
