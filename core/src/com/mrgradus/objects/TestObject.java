package com.mrgradus.objects;

import java.util.List;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mrgradus.screens.IScreen;

public class TestObject implements IObject {

	private IScreen screen;
	
	public TestObject(IScreen screen){
		this.screen=screen;
	}
	
	@Override
	public void update(float delta) {
		Gdx.app.log("TestObject","update "+delta);
		screen.setLevel(new TestLevel2(screen));

	}

	@Override
	public void render(SpriteBatch batch,int x,int y,int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<String> getPropertys() {
		// TODO Auto-generated method stub
		return null;
	}

}
