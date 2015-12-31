package com.sm.objects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.sm.helpers.AssetLoader;
import com.sm.levels.ALevel;
import com.sm.objects.buttons.BCharacterControl;
import com.sm.screens.IScreen;

public class MainCharacter extends AObject{
	enum CurrentState { STAYD, STAYL, STAYR, STAYU, WDOWN, WLEFT, WRIGHT, WUP}
	CurrentState currentState = CurrentState.STAYD;
	
	BCharacterControl buttonDown;
	BCharacterControl buttonLeft;
	BCharacterControl buttonRight;
	BCharacterControl buttonUp;
	Texture img;
	TextureRegion[] robotDown;
	TextureRegion[] robotUp;
	TextureRegion[] robotLeft;
	TextureRegion[] robotRight;
	Animation walkDown;
	Animation walkLeft;
	Animation walkRight;
	Animation walkUp;
	float stateTime;
	ALevel level;
	float speed;
	public MainCharacter(ALevel level) {
		this.level = level;

		stateTime = 0f;
		this.x=0;
		this.y=0;
		img = AssetLoader.robot;
		
		buttonDown=new BCharacterControl(AssetLoader.buttonDown, 100, 0, 128, 128);
		buttonLeft=new BCharacterControl(AssetLoader.buttonLeft, 0, 100, 128, 128);
		buttonRight=new BCharacterControl(AssetLoader.buttonRight, 200, 100, 128, 128);
		buttonUp=new BCharacterControl(AssetLoader.buttonUp, 100, 200, 128, 128);
		level.addObject(buttonDown);
		level.addObject(buttonLeft);
		level.addObject(buttonRight);
		level.addObject(buttonUp);
		TextureRegion imp[][] = TextureRegion.split(img, 64, 64);
		TextureRegion trAnDown[]  = new TextureRegion[4]; 
		TextureRegion trAnUp[]    = new TextureRegion[4]; 
		TextureRegion trAnLeft[]  = new TextureRegion[4]; 
		TextureRegion trAnRight[] = new TextureRegion[4]; 
		for(int i=0;i<4;i++){
				trAnDown[i] =imp[0][i];
				trAnLeft[i] =imp[1][i];
				trAnRight[i]=imp[2][i];
				trAnUp[i]   =imp[3][i];
		}
		walkDown  = new Animation(0.15f, trAnDown);
		walkLeft  = new Animation(0.15f, trAnLeft);
		walkRight = new Animation(0.15f, trAnRight);
		walkUp    = new Animation(0.15f, trAnUp);

	}
	
	@Override
	public void update(IScreen screen) {
		stateTime+=screen.getDelta();
		onClickButtonCharacterControl(screen);
	}

	public void onClickButtonCharacterControl(IScreen screen){
		if(buttonDown.onClick(screen)){
			this.y-=10;
		}
		if(buttonLeft.onClick(screen)){
			this.x-=10;
		}
		if(buttonRight.onClick(screen)){
			this.x+=10;
		}
		if(buttonUp.onClick(screen)){
			this.y+=10;
		}
	}
	
	@Override
	public void render(SpriteBatch batch, int x, int y, float scale) {
		batch.draw(walkRight.getKeyFrame(stateTime, true),x, y, width*scale, height*scale);
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	
	

}
