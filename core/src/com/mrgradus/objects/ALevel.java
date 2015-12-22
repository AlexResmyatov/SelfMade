package com.mrgradus.objects;

import java.util.ArrayList;
import java.util.List;

public abstract class ALevel {

	protected List<AObject> objects;
	
	public void update(float delta){
		
	}
	
	public List<AObject> getAllObjects(){
		return objects;
		
	}
	
	public List<AObject> getObjectsWithPropertys(List<String> propertys){
		List<AObject> objectsWithPropertys = new ArrayList<AObject>();
		for(AObject object: objects){
				if(object.getPropertys().containsAll(propertys)){
					objectsWithPropertys.add(object);
				}

		}
		return objectsWithPropertys;
		
	}
	
	public List<AObject> getObjectsWithPropertys(String property){
		return null;
		
	}
	
	public void dispose(){
		for(AObject object : objects){
			object.dispose();
		}
	}
}
