package com.mrgradus.objects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mrgradus.screens.IScreen;

public class TestObject2 extends AObject {
	
//	int x=300;
//	int y=0;
//	int width=100;
//	int height=100;
//	List<String> propertys;
//	SpriteBatch batch;
	private Texture img;
//	private IScreen screen;
	public TestObject2(int y) {
		x=500;
		width=100;
		height=100;
		this.y=y;
//		img = new Texture("badlogic.jpg");
		img = new Texture("a.png");
		propertys.add(Propertys.PR_IMPASSABLE);
	}
	public void update(IScreen screen) {
		if(onClick(screen)){
			x+=7;
			screen.getCamera().setCamX(screen.getCamera().getCamX()+5);
//			Gdx.app.log(null, this.toString());
		}
	
	
	}
	public void render(SpriteBatch batch,int x,int y,float scale) {
		batch.draw(img, x, y, width*scale, height*scale);
		
	}
	public void dispose(){
		img.dispose();
	}
}
