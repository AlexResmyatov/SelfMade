package com.mrgradus.objects;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mrgradus.screens.IScreen;

public class TestLevel2 extends ILevel {

	private IScreen screen;
	//private List<IObject> objects;
	SpriteBatch batch;
	
	
	public TestLevel2(IScreen screen){
		this.screen=screen;
		objects = new ArrayList<IObject>();
		batch = new SpriteBatch();
		objects.add(new TestObject2(screen,50));
		objects.add(new TestObject2(screen,200));
		objects.add(new TestObject2(screen,400));
		//adds an objects
	}
	
	public void update(float delta) {
		Gdx.gl.glClearColor(1, 1, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		for(int i=0;i<objects.size();i++){
			objects.get(i).update(delta);
//			if(objects.get(i)!=null) objects.get(i).render(batch);
//			Gdx.app.log(null, "render");
		}
		for(IObject object: objects){
//			object.update(delta);
			if(object!=null) object.render(batch);
		}
		batch.end();
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
