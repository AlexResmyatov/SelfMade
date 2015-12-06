package com.mrgradus.objects;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mrgradus.screens.IScreen;

public class TestLevel2 extends ALevel {

	private IScreen screen;
	//private List<IObject> objects;
	SpriteBatch batch;
	
	
	public TestLevel2(IScreen screen){
		this.screen=screen;
		objects = new ArrayList<IObject>();
		batch = new SpriteBatch();
		objects.add(new TestObject2(screen,50));
		objects.add(new TestObject2(screen,150));
		objects.add(new TestObject2(screen,300));
		//adds an objects
	}
	
	public void update(float delta) {
		for(int i=0;i<objects.size();i++){
			objects.get(i).update(delta);
		}

	}


	public List<IObject> getObjectsWithPropertys(List<Property> propertys) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<IObject> getObjectsWithPropertys(Property property) {
		// TODO Auto-generated method stub
		return null;
	}

}
