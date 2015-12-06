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
	int width=100;
	int height=100;
	SpriteBatch batch;
	private Texture img;
	private IScreen screen;
	public TestObject2(IScreen screen,int y) {
		this.screen = screen;
		this.y=y;
		batch = new SpriteBatch();
//		img = new Texture("badlogic.jpg");
		img = new Texture("a.png");
	}
	@Override
	public void update(float delta) {
		if(onClick()){
			x+=10;
		}

	}

	@Override
	public void render(SpriteBatch batch,int x,int y,int width, int height) {
		batch.draw(img, x, y, width, height);

	}
	
	private boolean onClick(){
		for(Click click: screen.getTouches().values()){
			if(click.getX()>x && click.getX()<x+width && 
					click.getY()>y && click.getY()<y+height) 
				return true;
		}
		return false;
	}
	@Override
	public int getX(){
		return x;
	}
	@Override
	public int getY(){
		return y;
	}
	@Override
	public int getWidth(){
		return width;
	}
	@Override
	public int getHeight(){
		return height;
	}
	
	
	public String toString(){
		return "TestObject2 "+x+" "+y;
	}
	
	@Override
	public void dispose(){
		img.dispose();
		screen.getLevel().getAllObjects().remove(this);
	}
}
