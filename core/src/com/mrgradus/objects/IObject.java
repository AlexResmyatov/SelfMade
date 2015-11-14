package com.mrgradus.objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mrgradus.screens.IScreen;

public interface IObject {

	public void update(float delta);
	
	public void render(SpriteBatch batch);
}
