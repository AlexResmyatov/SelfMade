package com.mrgradus.objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mrgradus.screens.IScreen;

public interface IObject {

	public int getX();
	
	public int getY();
	
	public int getWidth();
	
	public int getHeight();
	
	public void update(float delta);
	
	public void render(SpriteBatch batch,int x, int y, int width, int height );
	
	public void dispose();
}
