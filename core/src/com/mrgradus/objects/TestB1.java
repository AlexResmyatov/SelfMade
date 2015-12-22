package com.mrgradus.objects;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mrgradus.helpers.Click;
import com.mrgradus.screens.IScreen;
import com.mrgradus.screens.TestScreen;

public class TestB1 extends AObject {

	private Texture img;
	public TestB1(int y) {
		x=0;
		width=100;
		height=100;
//		this.y=y;
		img = new Texture("badlogic.jpg");
//		img = new Texture("a.png");
		propertys.add(Propertys.PR_IMPASSABLE);
	}
	public void update(IScreen screen) {
		if(onClick(screen)){
//			x+=10;
//			screen.getCamera().setCamX(screen.getCamera().getCamX()+5);
			TestScreen screen1=new TestScreen(screen.getGame());
			screen.setScreen(screen.getGame(), screen1);
			//screen.getCamera().setScale(screen.getCamera().getScale()+0.002f);
			//Gdx.app.log(null, this.toString());
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
