package com.mrgradus.helpers;

import java.util.List;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mrgradus.objects.IObject;

public class Camera {

	SpriteBatch batch;
	public Camera(){
		batch = new SpriteBatch();
	}
	
	public void render(List<IObject> objects){
		Gdx.gl.glClearColor(0, 1, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		
		for(IObject object: objects){
			object.render(batch);
		}
		batch.end();
	}
}
