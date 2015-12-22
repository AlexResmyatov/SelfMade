package com.mrgradus.objects;

import java.util.List;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public interface IObject {

	public int getX();
	
	public int getY();
	
	public int getWidth();
	
	public int getHeight();
	
	public List<String> getPropertys();
	
	public void update(float delta);
	
	public void render(SpriteBatch batch,int x, int y, int width, int height );
	
	public void dispose();
}
