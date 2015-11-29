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
			x+=2;
//			for(IObject object : screen.getLevel().getAllObjects()){
//				TestObject2 to2 = (TestObject2)object;
//				Gdx.app.log(""+to2, "x "+to2.getX()+" y"+to2.getY());
//			}
		}

	}

	@Override
	public void render(SpriteBatch batch) {
		batch.draw(img, x, y, 100, 100);

	}
	
	private boolean onClick(){
		for(Click click: screen.getTouches().values()){
			if(click.getX()>x && click.getX()<x+200 && 
					(Gdx.graphics.getHeight()-click.getY())>y && 
					(Gdx.graphics.getHeight()-click.getY())<y+200) return true;
		}
		return false;
	}
	
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
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
