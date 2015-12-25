package com.sm.objects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.sm.screens.IScreen;
import com.sm.screens.TestScreen;

public class TestB1 extends AObject {

	private Texture img;
	public TestB1(int y) {
		x=0;
		width=100;
		height=100;
		img = new Texture("badlogic.jpg");
		properties.add(Properties.PR_IMPASSABLE);
	}
	public void update(IScreen screen) {
		if(onClick(screen)){
			screen.setScreen(new TestScreen(screen.getGame()));
		}
		x=(int)screen.getCamera().getCamX();
		y=(int)screen.getCamera().getCamY();
	}

	public void render(SpriteBatch batch,int x,int y,float scale) {
		batch.draw(img, x, y, width*scale, height*scale);
		
	}
	public void dispose(){
		img.dispose();
	}
	
}
