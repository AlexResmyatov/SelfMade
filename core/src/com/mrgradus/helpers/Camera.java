package com.mrgradus.helpers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mrgradus.objects.IObject;
import com.mrgradus.screens.IScreen;
import com.mrgradus.screens.TestScreen;

public class Camera {
	
	
	SpriteBatch batch;
	IScreen screen;
	public Camera(IScreen screen){
		this.screen=(TestScreen) screen;
		batch = new SpriteBatch();
	}
	
	public void render(){
		
		Gdx.gl.glClearColor(0, 1, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		
		for(IObject object: screen.getLevel().getAllObjects()){
			//TestObject2 object = new TestObject2();
			//object=(TestObject2)object;
			object.render(batch,(int)((float)object.getX()*screen.getScale()),(int)((float)object.getY()*screen.getScale()),
					(int)((float)object.getWidth()*screen.getScale()),(int) ((float)object.getHeight()*screen.getScale()));
		}
		batch.end();
	}
}
