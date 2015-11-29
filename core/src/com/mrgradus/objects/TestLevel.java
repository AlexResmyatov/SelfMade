package com.mrgradus.objects;

import java.util.ArrayList;
import java.util.List;

import com.mrgradus.screens.IScreen;

public class TestLevel extends ALevel {

	private IScreen screen;
	private List<IObject> objects;
	
	public TestLevel(IScreen screen){
		this.screen=screen;
		objects = new ArrayList<IObject>();
		objects.add(new TestObject(screen));
		//adds an objects
	}
	
	public void update(float delta) {
		for(IObject object: objects){
			object.update(delta);
		}
	}


}
