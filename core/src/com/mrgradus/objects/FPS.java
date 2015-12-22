package com.mrgradus.objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mrgradus.screens.IScreen;

public class FPS extends AObject {
	
//	float max=0;
//	float min=99999;
	BitmapFont font;
	private float delta;
	public FPS(){
		x=50;
		
		width=100;
		height=100;
		font = new BitmapFont();
		font.setColor(0, 0, 0, 1);
		
		propertys.add(Propertys.PR_IMPASSABLE);
	}
	
	@Override
	public void update(IScreen screen) {
		this.delta=screen.getDelta();
//		if(1.f/delta>max) max= 1.f/delta;
//		if(1.f/delta<min) min= 1.f/delta;
	}
	
	@Override
	public void render(SpriteBatch batch,int x,int y,float scale) {
		font.draw(batch, "fps: "+String.format("%.2f", 1.f/delta) , 50, Gdx.graphics.getHeight()-width);
//		font.draw(batch, "min: "+min , 50, Gdx.graphics.getHeight()-width-30);
//		font.draw(batch, "max: "+max , 50, Gdx.graphics.getHeight()-width-60);
	}
	
	@Override
	public void dispose(){
		font.dispose();
	}

	
	

}
