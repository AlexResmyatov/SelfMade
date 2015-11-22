package com.mrgradus.objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mrgradus.helpers.Click;
import com.mrgradus.screens.IScreen;

public class TestObject2 implements IObject {
	
	int x=0;
	int y=0;
	SpriteBatch batch;
	private Texture img;
	private IScreen screen;
	public TestObject2(IScreen screen) {
		this.screen = screen;
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}
	@Override
	public void update(float delta) {
		if(onClick()){
			x+=50;
		}

	}

	@Override
	public void render(SpriteBatch batch) {
		Gdx.gl.glClearColor(1, 1, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		this.batch.begin();
		this.batch.draw(img, x, 0, 100, 100);
		this.batch.end();

	}
	
	private boolean onClick(){
		for(Click click: screen.getTouches()){
			if(click.getX()>x && click.getX()<x+100) return true;
		}
		return false;
	}

}
