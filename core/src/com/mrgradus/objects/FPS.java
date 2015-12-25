package com.mrgradus.objects;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mrgradus.screens.IScreen;

public class FPS extends AObject {
	
	BitmapFont font;
	private float delta;
	public FPS(){
		x=0;
		y=0;
		width=100;
		height=100;
		font = new BitmapFont();
		font.setColor(0, 0, 0, 1);
		
		properties.add(Properties.PR_IMPASSABLE);
	}
	
	@Override
	public void update(IScreen screen) {
		this.delta=screen.getDelta();
	}
	
	@Override
	public void render(SpriteBatch batch,int x,int y,float scale) {
		font.draw(batch, "fps: "+String.format("%.2f", 1.f/delta) , 50, Gdx.graphics.getHeight()-width);
	}
	
	@Override
	public void dispose(){
		font.dispose();
	}

	
	

}
