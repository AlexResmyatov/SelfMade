package com.mrgradus.objects;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mrgradus.screens.IScreen;

public class TestLevel2 extends ALevel {

	private IScreen screen;
	SpriteBatch batch;
	
	
	public TestLevel2(IScreen screen){
		this.screen=screen;
		objects = new ArrayList<AObject>();
		batch = new SpriteBatch();
		objects.add(new TestObject2(50));
		objects.add(new TestObject2(250));
		objects.add(new TestObject2(400));
		objects.add(new TestB1(0));
		objects.add(new FPS());

	}
	
	public void update(float delta) {
		
//		ArrayList<String> properties = new ArrayList<>();
//		properties.add("a");
//		properties.add(Properties.PR_IMPASSABLE);
//		
//		ArrayList<AObject> objects = (ArrayList<AObject>) getObjectsWithProperties(properties);
//		
//		for(int i=0;i<objects.size();i++){
//			objects.get(i).update(screen);
//		}
		
		
		
		
		for(int i=0;i<objects.size();i++){
			objects.get(i).update(screen);
		}
		
	}


}
