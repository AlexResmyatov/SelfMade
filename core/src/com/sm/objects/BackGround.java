package com.sm.objects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.sm.screens.IScreen;

public class BackGround extends AObject{
	private Texture img;
	public BackGround() {
		this.x=0;
		this.y=0;
		this.width=1280;
		this.height=1280;
		img = new Texture("ferrum.jpg");
		
	}
	
	
	public void update(IScreen screen) {
	
	}
	public void render(SpriteBatch batch,int x,int y,float scale) {
		batch.draw(img, x, y, width*scale, height*scale);
		
	}
	public void dispose(){
		img.dispose();
	}
}
