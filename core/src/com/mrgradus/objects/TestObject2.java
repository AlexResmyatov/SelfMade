package com.mrgradus.objects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mrgradus.screens.IScreen;

public class TestObject2 extends AObject {
	

	private Texture img;
	public TestObject2(int y) {
		x=500;
		width=100;
		height=100;
		this.y=y;
		img = new Texture("a.png");
		properties.add("a");
		properties.add(Properties.PR_IMPASSABLE);
		
	}
	
	
	public void update(IScreen screen) {
		if(onClick(screen)){
			x+=7;
			screen.getCamera().setCamX(screen.getCamera().getCamX()+5);
		}
	
	}
	public void render(SpriteBatch batch,int x,int y,float scale) {
		batch.draw(img, x, y, width*scale, height*scale);
		
	}
	public void dispose(){
		img.dispose();
	}
}
