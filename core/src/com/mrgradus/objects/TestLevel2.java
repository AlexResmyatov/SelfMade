package com.mrgradus.objects;

import java.util.ArrayList;
import java.util.List;

import com.mrgradus.screens.IScreen;

public class TestLevel2 extends ILevel {

	private IScreen screen;
	private List<IObject> objects;
	
	public TestLevel2(IScreen screen){
		this.screen=screen;
		objects = new ArrayList<IObject>();
		objects.add(new TestObject2(screen));
		//adds an objects
	}
	
	public void update(float delta) {
		for(IObject object: objects){
			object.update(delta);
			object.render(null);
		}
		

	}

	public List<IObject> getAllObjects() {
		// TODO Auto-generated method stub
		return null;
	}

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
