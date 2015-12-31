package com.sm.objects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.sm.helpers.AssetLoader;
import com.sm.screens.IScreen;

public class Protagonist extends AObject{
	
	Texture img;
	TextureRegion robotUp;
	Texture robotDown;
	TextureRegion robotLeft;
	TextureRegion robotRight;
	Animation walkDown;
	float stateTime;
	public Protagonist() {
		stateTime = 0f;
		this.x=0;
		this.y=0;
		img = AssetLoader.robot;
		
		robotDown = new Texture("robotDown.png");
		
		TextureRegion imp[][] = TextureRegion.split(robotDown, 64, 64);
		TextureRegion anDown[] = new TextureRegion[4]; 
		for(int i=0;i<4;i++){
			anDown[i]=imp[0][i];
		}
		walkDown = new Animation(0.15f, anDown);
//		robotUp = new TextureRegion(img, 0, 192, 64, 64);
//		robotLeft = new TextureRegion(img, 0, 64, 64, 64);
//		robotRight = new TextureRegion(img, 0, 128, 64, 64);
	}
	
	@Override
	public void update(IScreen screen) {
		stateTime+=screen.getDelta();
	}

	@Override
	public void render(SpriteBatch batch, int x, int y, float scale) {
		batch.draw(walkDown.getKeyFrame(stateTime, true),x, y, width*scale, height*scale);
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
