package com.sm.objects.buttons;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.sm.objects.AObject;
import com.sm.screens.IScreen;
import com.sm.screens.TestScreen;

public class BStart extends AObject {

	private Texture img;
	
	public BStart(){
		img = new Texture("background.jpg");
		this.x=340;
		this.y=400;
		this.width = 600;
		this.height = 200;
	}
	
	@Override
	public void update(IScreen screen) {
		if(onClick(screen)){
			screen.setScreen(new TestScreen(screen.getGame()));
		}
	}

	@Override
	public void render(SpriteBatch batch, int x, int y, float scale) {
		
		batch.draw(img, x, y, width*scale, height*scale);
		
	}

	@Override
	public void dispose() {
		img.dispose();
	}

}
