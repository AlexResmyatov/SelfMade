package com.sm.objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.sm.helpers.AssetLoader;
import com.sm.screens.IScreen;

public class Concrete extends AObject {
	

	private TextureRegion img;
	public Concrete(int x, int y) {
		this.x=x;
		this.y=y;
		width=64;
		height=64;
		img = AssetLoader.concrete;
//		properties.add("a");
//		properties.add(Properties.PR_IMPASSABLE);
		
	}
	
	
	public void update(IScreen screen) {
		if(onClick(screen)){
			x+=10;
			screen.getCamera().setCamX(screen.getCamera().getCamX()-10);
		}
	}
	public void render(SpriteBatch batch,int x,int y,float scale) {
		batch.draw(img, x, y, width*scale, height*scale);
		
	}
	public void dispose(){
		
	}
}
