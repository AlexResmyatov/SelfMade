package com.mrgradus.objects;

import java.util.ArrayList;
import java.util.List;

import com.mrgradus.screens.IScreen;

public class TestLevel implements ILevel {

	private IScreen screen;
	private List<IObject> objects;
	
	public TestLevel(IScreen screen){
		this.screen=screen;
		objects = new ArrayList<IObject>();
		objects.add(new TestObject(screen));
		//adds an objects
	}
	
	@Override
	public void update(float delta) {
		for(IObject object: objects){
			object.update(delta);
		}
	}

	@Override
	public List<IObject> getAllObjects() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IObject> getObjectsWithPropertys(List<Property> propertys) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IObject> getObjectsWithPropertys(Property property) {
		// TODO Auto-generated method stub
		return null;
	}


}
