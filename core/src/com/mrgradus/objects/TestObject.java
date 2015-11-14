package com.mrgradus.objects;

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
		Gdx.app.log("TestObject","update");

	}

	@Override
	public void render(SpriteBatch batch) {
		// TODO Auto-generated method stub

	}

}
