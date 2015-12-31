package com.sm.objects.buttons;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.sm.objects.AObject;
import com.sm.screens.IScreen;

public class BCharacterControl extends AObject{

	TextureRegion img;
	int staticX;
	int staticY;
	public BCharacterControl(TextureRegion img, int x, int y, int width, int height) {
		this.img=img;
		staticX=x;
		staticY=y;
		this.width=width;
		this.height=height;
	}
	
	@Override
	public void update(IScreen screen) {
		x=staticX+((int)screen.getCamera().getCamX());
		y=staticY+((int)screen.getCamera().getCamY());
	}

	@Override
	public void render(SpriteBatch batch, int x, int y, float scale) {
		
		batch.draw(img, x, y, width*scale, height*scale);
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
