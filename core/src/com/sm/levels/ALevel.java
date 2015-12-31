package com.sm.levels;

import java.util.ArrayList;
import java.util.List;

import com.sm.objects.AObject;
import com.sm.screens.IScreen;

public abstract class ALevel {

	protected List<AObject> objects;
	protected IScreen screen;
	
	abstract public void update(float delta);
	
	public List<AObject> getAllObjects(){
		return objects;
		
	}
	
	public void addObject(AObject object){
		objects.add(object);
	}
	
	public List<AObject> getObjectsWithProperties(List<String> properties){
		List<AObject> withProperty = new ArrayList<>();
		for (AObject object:objects){
			if (object.checkProperties(properties)) withProperty.add(object); 
		}
		return withProperty;
	}
	
	public List<AObject> getObjectsWithProperties(String property){
		List<AObject> withProperty = new ArrayList<>();
		for (AObject object:objects){
			if (object.checkProperties(property)) withProperty.add(object); 
		}
		return withProperty;
	}
	
	public void dispose(){
		for(AObject object : objects){
			object.dispose();
		}
	}
}
